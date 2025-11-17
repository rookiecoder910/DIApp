package com.example.diapp

import javax.inject.Inject
//@Inject : tells hilt how to create an instance of engine
class Engine @Inject constructor(){
    fun start()= "Engine started"
}