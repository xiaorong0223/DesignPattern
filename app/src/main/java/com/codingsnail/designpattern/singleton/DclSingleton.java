package com.codingsnail.designpattern.singleton;

/**
 * Created by Snail on 12/6/2017 10:54 AM
 * Contact with slowsnail0223@gmail.com
 * Double Check Lock
 */
public class DclSingleton {

    private volatile static DclSingleton instance = null;

    private DclSingleton() {
    }

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized ((DclSingleton.class)) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
}
