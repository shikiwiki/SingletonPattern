package com.example.singletonpattern

// synchronized Singleton Pattern optimized by double checking

open class Singleton5 private constructor() {

    companion object {
        private val lock = Any()

        @Volatile
        var singleton5: Singleton5? = null

        fun getInstance(): Singleton5? {
            if (singleton5 == null) {
                synchronized(lock) {
                    if (singleton5 == null) {
                        singleton5 = Singleton5()
                    }
                }
            }
            return singleton5
        }
    }
}
