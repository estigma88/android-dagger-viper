package com.example.daniel.silaba.modules.feed.module;

import com.example.daniel.silaba.modules.feed.entity.CommentFeedData;

public interface CommentFeedModuleInterface {
    void refreshComments();
    void loadMoreComments();

    CommentFeedData comment(Integer index);
}
