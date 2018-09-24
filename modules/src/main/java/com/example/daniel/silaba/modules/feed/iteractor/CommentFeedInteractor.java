package com.example.daniel.silaba.modules.feed.iteractor;

import com.example.daniel.silaba.modules.feed.entity.CommentFeedData;
import com.example.daniel.silaba.modules.service.user.User;
import com.example.daniel.silaba.modules.service.comment.Comment;
import com.example.daniel.silaba.modules.service.comment.CommentList;
import com.example.daniel.silaba.modules.service.comment.CommentService;
import com.example.daniel.silaba.modules.service.comment.CommentServiceResult;

import java.util.ArrayList;
import java.util.List;

public class CommentFeedInteractor implements CommentFeedInteractorInterface {
    private final CommentFeedInteractorOutput output;
    private final CommentService service;

    public CommentFeedInteractor(CommentFeedInteractorOutput output, CommentService service) {
        this.output = output;
        this.service = service;
    }

    private void fetchComments(String postId, Integer offset, Integer limit) {
        CommentServiceResult commentServiceResult = service.fetchComments(postId, offset, limit);

        if (commentServiceResult.getError() == null) {
            if (offset < 0) {
                output.commentFeedDidRefresh(commentServiceResult.getError());
            } else {
                output.commentFeedDidLoadMore(commentServiceResult.getError());
            }
        }

        CommentList commentList = commentServiceResult.getCommentList();
        if (commentList == null || commentList.getComments() == null || commentList.getComments().isEmpty()) {
            if (offset < 0) {
                output.commentFeedDidRefresh(new ArrayList<CommentFeedData>());
            } else {
                output.commentFeedDidLoadMore(new ArrayList<CommentFeedData>());
            }
        }

        List<CommentFeedData> commentFeedDataList = new ArrayList<>();

        for (Comment comment : commentList.getComments()) {
            if (!commentList.getUsers().containsKey(comment.getUserId())) {
                continue;
            }

            User user = commentList.getUsers().get(comment.getUserId());


            commentFeedDataList.add(CommentFeedData.builder()
                    .id(comment.getId())
                    .content(comment.getMessage())
                    .timestamp(comment.getTimestamp())
                    .authorId(user.getId())
                    .authorName(user.getDisplayName())
                    .authorAvatar(user.getAvatarUrl())
                    .build());
        }

        if (offset < 0) {
            output.commentFeedDidRefresh(commentFeedDataList);
        } else {
            output.commentFeedDidLoadMore(commentFeedDataList);
        }
    }
}
