package com.neo.dagger2demo.dagger;

import com.neo.dagger2demo.car.DieselEngine;
import com.neo.dagger2demo.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    // assigned value at runtime via module constructor then to the provideEngine method
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    // not needed since provides method available for getting int value whereEver needed
//    @Provides
//    Engine Engine(){
//        return new DieselEngine(horsePower);
//    }

    @Provides
    Engine ProvideEngine(DieselEngine engine){
        return engine;
    }

}
