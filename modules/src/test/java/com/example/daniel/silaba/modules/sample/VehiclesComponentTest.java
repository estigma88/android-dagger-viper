package com.example.daniel.silaba.modules.sample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniel on 19/09/18.
 */
public class VehiclesComponentTest {
    @Test
    public void givenGeneratedComponent_whenBuildingCar_thenDependenciesInjected() {
        VehiclesComponent component = DaggerVehiclesComponent.create();

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