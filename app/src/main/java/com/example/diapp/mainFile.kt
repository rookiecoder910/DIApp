package com.example.diapp

fun main(){
    //create a dagger app component using CI
    //hilt/dagger generates the dagger app component class at compile time and we can use it
    val appComponent=DaggerAppComponent.create()
    //create a car instance
//    val car:Car=appComponent.getCar()
    //use the car
//    car.drive()
    //create a car instance using field injection
    //retreives the car instance from the dagger app component
    val car=Car()
    //inject dependencies into the car's fields
    appComponent.inject(car)
    //use the car
    car.drive()


}