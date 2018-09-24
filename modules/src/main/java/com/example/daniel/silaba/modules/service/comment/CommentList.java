package com.example.daniel.silaba.modules.service.comment;

import com.example.daniel.silaba.modules.service.user.User;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class CommentList {
    private List<Comment> comments;
    private Map<String, User> users;
}
