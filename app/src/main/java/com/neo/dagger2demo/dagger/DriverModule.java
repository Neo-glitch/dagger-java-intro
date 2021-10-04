package com.neo.dagger2demo.dagger;

import com.neo.dagger2demo.car.Driver;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    // singleton here since, Driver has no inject constructor
//    @Binds
    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    };

}
