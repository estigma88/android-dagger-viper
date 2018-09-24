package com.example.daniel.silaba.modules.service.comment;

import lombok.Data;

@Data
public class CommentServiceResult {
    private CommentList commentList;
    private CommentServiceError error;
    private String nextOffset;
}
