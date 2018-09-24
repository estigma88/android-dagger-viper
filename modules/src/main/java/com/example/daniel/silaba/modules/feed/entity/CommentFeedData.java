package com.example.daniel.silaba.modules.feed.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentFeedData {
    private final String id;
    private final String content;
    private final Double timestamp;
    private final String authorName;
    private final String authorId;
    private final String authorAvatar;
}
