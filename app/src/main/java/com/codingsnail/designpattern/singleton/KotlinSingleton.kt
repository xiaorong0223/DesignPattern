package com.codingsnail.designpattern.singleton

/**
 * Created by Snail on 12/15/2017 1:18 PM
 * Contact with slowsnail0223@gmail.com
 */
class KotlinSingleton {

    public var value: KotlinSingleton? = null

    private object mHolder {
        val INSTANCE = KotlinSingleton()
    }

    companion object Factory {
        fun getInstance(): KotlinSingleton {
            return mHolder.INSTANCE
        }
    }
}