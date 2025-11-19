package com.example.diapp

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    //component is like a bridge between the modules(which provides the dependencies)
    // and the classes that need those dependencies
    //This interface defines the API for retrieving the dependencies from the dagger dep. graph
//    fun getCar():Car
    fun inject(car:Car)

}



