package com.example.daniel.silaba.modules.feed.view;

public interface CommentFeedScene {
    void reload();
    void showEmptyView();
    void showInitialLoadView();
    void showRefreshView();
    void hideEmptyView();
    void hideInitialLoadView();
    void hideRefreshView();

    void didRefreshComments(String error);
    void didLoadMoreComments(String error);
}
