package com.example.diapp

fun main(){
    val engine=Engine()
    //dependency is injected in the car
    val car=Car(engine)
    car.drive()
}