package com.example.diapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//hilt module : define how dependencies are provided
@Module // marks the class as a module for dependency provisioning
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides //tells hilt how to provide an object
    @Singleton // ensures only a single instance of the object is created
    fun provideEngine():Engine{
        return Engine() //single instance of engine
    }
//    @Provides
//    @Singleton
//    fun provideCar(engine:Engine):Car{
//        return Car(engine)
//    }

}