package com.example.daniel.silaba.modules.service.comment;

import com.example.daniel.silaba.modules.sample.Car;
import com.example.daniel.silaba.modules.sample.DaggerVehiclesComponent;
import com.example.daniel.silaba.modules.sample.VehiclesComponent;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommentServiceComponentTest {
    @Test
    public void givenGeneratedComponent_whenBuildingCommentService_thenDependenciesInjected() {
        VehiclesComponent component = DaggerCommentServiceComponent.create();

        Car carOne = component.buildCar();
        Car carTwo = component.buildCar();

        Assert.assertNotNull(carOne);
        Assert.assertNotNull(carTwo);
        Assert.assertNotNull(carOne.getEngine());
        Assert.assertNotNull(carTwo.getEngine());
        Assert.assertNotNull(carOne.getBrand());
        Assert.assertNotNull(carTwo.getBrand());
        Assert.assertNotEquals(carOne.getEngine(), carTwo.getEngine());
        Assert.assertEquals(carOne.getBrand(), carTwo.getBrand());
    }
}