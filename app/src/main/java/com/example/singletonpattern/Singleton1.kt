package com.example.singletonpattern

//static methods in Java <===> companion objects in Kotlin
// primitive Singleton pattern

open class Singleton1 private constructor() {

    companion object {
        var singleton1: Singleton1? = null

        fun getInstance(): Singleton1? {
            if (singleton1 == null) {
                singleton1 = Singleton1()
            }
            return singleton1
        }
    }
}