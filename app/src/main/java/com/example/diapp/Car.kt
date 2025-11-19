package com.example.diapp

import javax.inject.Inject

//now in this dependency is passed from outside
class Car{
//@Inject constructor(private val engine:Engine) { //DI constructor injection
    //dependency is created inside the class
//    //problem:car creating his own instances of engine
//    private val engine= Engine();

//field injection :"engine" will be injected into this field automatically by hilt at runtime

//    @Inject
    lateinit var engine:Engine
    @Inject
    fun installEngine(engine:Engine){
        this.engine=engine
    }

    fun drive(){
        println(engine.start());
    }
    //car depends on engine to start
}