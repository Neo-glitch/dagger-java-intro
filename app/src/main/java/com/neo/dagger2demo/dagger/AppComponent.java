package com.neo.dagger2demo.dagger;


import com.neo.dagger2demo.car.Driver;

import javax.inject.Singleton;

import dagger.Component;


// app level singleton
@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {

    // exposes the driver for activity component to use via dagger(not needed when component is a mainComponent)
//    Driver getDriver();

    // method to ret ActivityComponent(SubComponent), module passed is the one that isn't abstract or requires a param in it's constructor.
    // factory method of getting subcomponent
//    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);

    // done this way since SubComponent uses SubComponent.Builder
//    ActivityComponent.Builder getActivityComponentBuilder();

    // done this way since SubComponent uses a SubComponent.Factory
    ActivityComponent.Factory getActivityComponentFactory();



}
