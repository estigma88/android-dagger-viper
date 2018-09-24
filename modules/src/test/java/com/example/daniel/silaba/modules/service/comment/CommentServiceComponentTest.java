package com.example.daniel.silaba.modules.service.comment;

import org.junit.Assert;
import org.junit.Test;

public class CommentServiceComponentTest {
    @Test
    public void givenGeneratedComponent_whenBuildingCommentService_thenDependenciesInjected() {
        CommentServiceComponent component = DaggerCommentServiceComponent.create();

        CommentService service = component.componentCommentService();

        Assert.assertNotNull(component);
        Assert.assertNotNull(service);
    }
}