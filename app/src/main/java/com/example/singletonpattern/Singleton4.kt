package com.example.singletonpattern

// minimal synchronization usage Singleton pattern

open class Singleton4 private constructor() {

    companion object {
        private val lock = Any()

        @Volatile
        var singleton4: Singleton4? = null

        fun getInstance(): Singleton4? = synchronized(lock) {
            if (singleton4 == null) {
                singleton4 = Singleton4()
            }
            return singleton4
        }
    }
}