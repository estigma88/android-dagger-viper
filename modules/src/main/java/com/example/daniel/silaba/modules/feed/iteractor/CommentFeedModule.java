package com.example.daniel.silaba.modules.feed.iteractor;

import com.example.daniel.silaba.modules.feed.entity.CommentFeedData;
import com.example.daniel.silaba.modules.service.comment.CommentServiceError;

import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommentFeedModule {
    @Provides
    @Singleton
    public CommentFeedInteractorOutput provideCommentFeedInteractorOutput() {
        return new CommentFeedInteractorOutput() {

            @Override
            public void commentFeedDidRefresh(List<CommentFeedData> feed) {

            }

            @Override
            public void commentFeedDidLoadMore(List<CommentFeedData> feed) {

            }

            @Override
            public void commentFeedDidRefresh(CommentServiceError error) {

            }

            @Override
            public void commentFeedDidLoadMore(CommentServiceError error) {

            }
        };
    }
}
