package com.example.daniel.silaba.modules.feed.iteractor;

import com.example.daniel.silaba.modules.service.comment.CommentServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CommentFeedModule.class, CommentServiceModule.class})
public interface ComponentFeedInteractorComponent {
    CommentFeedInteractor componentFeedInteractorInterface();
}

