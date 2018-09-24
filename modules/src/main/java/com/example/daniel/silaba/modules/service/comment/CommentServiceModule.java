package com.example.daniel.silaba.modules.service.comment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommentServiceModule {
    @Provides
    @Singleton
    public CommentService provideCommentService() {
        return new CommentService() {
            @Override
            public CommentServiceResult fetchComments(String postId, Integer offset, Integer limit) {
                return null;
            }
        };
    }
}

