package com.example.daniel.silaba.modules.service.comment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CommentServiceModule.class})
public interface CommentServiceComponent {
    CommentService componentCommentService();
}

