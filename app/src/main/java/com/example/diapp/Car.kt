package com.example.diapp
//now in this dependency is passed from outside
class Car(private val engine:Engine) {
    //dependency is created inside the class
//    //problem:car creating his own instances of engine
//    private val engine= Engine();
    fun drive(){
        println(engine.start());
    }
    //car depends on engine to start
}