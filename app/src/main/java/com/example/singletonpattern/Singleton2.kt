package com.example.singletonpattern

// early initialization Singleton pattern

class Singleton2 private constructor() {

    companion object {
        private var singleton2: Singleton2? = Singleton2()

        fun getInstance(): Singleton2? {
            return singleton2
        }
    }
}