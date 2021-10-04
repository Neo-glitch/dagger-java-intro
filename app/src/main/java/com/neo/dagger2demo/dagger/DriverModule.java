package com.neo.dagger2demo.dagger;

import com.neo.dagger2demo.car.Driver;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    // singleton here since, Driver has no inject constructor
    @Provides
    @Singleton
    Driver provideDriver(){
        return new Driver(driverName);
    };

}
