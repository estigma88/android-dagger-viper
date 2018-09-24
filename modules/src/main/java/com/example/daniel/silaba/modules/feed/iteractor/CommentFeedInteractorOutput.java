package com.example.daniel.silaba.modules.feed.iteractor;

import com.example.daniel.silaba.modules.feed.entity.CommentFeedData;
import com.example.daniel.silaba.modules.service.comment.CommentServiceError;

import java.util.List;

public interface CommentFeedInteractorOutput {
    void commentFeedDidRefresh(List<CommentFeedData> feed);
    void commentFeedDidLoadMore(List<CommentFeedData> feed);
    void commentFeedDidRefresh(CommentServiceError error);
    void commentFeedDidLoadMore(CommentServiceError error);
}
