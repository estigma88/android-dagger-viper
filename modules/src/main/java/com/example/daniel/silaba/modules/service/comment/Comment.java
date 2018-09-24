package com.example.daniel.silaba.modules.service.comment;

import lombok.Data;

@Data
public class Comment {
    private String id;
    private String message;
    private Double timestamp;
    private String userId;
}
