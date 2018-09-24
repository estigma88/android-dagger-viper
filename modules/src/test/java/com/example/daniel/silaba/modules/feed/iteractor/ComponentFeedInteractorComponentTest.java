package com.example.daniel.silaba.modules.feed.iteractor;

import org.junit.Assert;
import org.junit.Test;

public class ComponentFeedInteractorComponentTest {
    @Test
    public void givenGeneratedComponent_whenBuildingCommentService_thenDependenciesInjected() {
        ComponentFeedInteractorComponent component = DaggerComponentFeedInteractorComponent.create();

        CommentFeedInteractor interactor = component.componentFeedInteractorInterface();

        Assert.assertNotNull(component);
        Assert.assertNotNull(interactor);
        Assert.assertNotNull(interactor.getOutput());
        Assert.assertNotNull(interactor.getService());
    }
}