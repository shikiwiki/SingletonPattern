package com.example.singletonpattern

// synchronized Singleton pattern

open class Singleton3 private constructor() {

    companion object {
        var singleton3: Singleton3? = null

        @Synchronized
        fun getInstance(): Singleton3? {
            if (singleton3 == null) {
                singleton3 = Singleton3()
            }
            return singleton3
        }
    }
}