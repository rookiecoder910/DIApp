package com.example.diapp

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//hilt module : define how dependencies are provided
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

}