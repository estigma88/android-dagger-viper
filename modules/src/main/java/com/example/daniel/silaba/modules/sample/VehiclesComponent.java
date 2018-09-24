package com.example.daniel.silaba.modules.sample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {
    Car buildCar();
}

