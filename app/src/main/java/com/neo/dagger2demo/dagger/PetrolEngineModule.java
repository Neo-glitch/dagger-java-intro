package com.neo.dagger2demo.dagger;


import com.neo.dagger2demo.car.Engine;
import com.neo.dagger2demo.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {
    // change to normal class for method to work


    // method 1
//    @Provides
//    Engine provideEngine(PetrolEngine engine){
//        return engine;
//    }

    // shorter way of implement fun above, but class must be abstract, normal java stuff
    // takes just a single arg, which is the class obj implementing the Engine interface
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
