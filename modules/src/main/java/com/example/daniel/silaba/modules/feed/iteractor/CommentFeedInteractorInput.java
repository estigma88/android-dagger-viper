package com.example.daniel.silaba.modules.feed.iteractor;

public interface CommentFeedInteractorInput {
    void fetchNew(String postId, Integer limit);
    void fetchNext(String postId, Integer limit);
}
