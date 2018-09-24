package com.example.daniel.silaba.modules.service.comment;

public interface CommentService {
    CommentServiceResult fetchComments(String postId, Integer offset, Integer limit);
}
