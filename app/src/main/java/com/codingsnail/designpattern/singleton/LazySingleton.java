package com.codingsnail.designpattern.singleton;

/**
 * Created by Snail on 12/6/2017 10:54 AM
 * Contact with slowsnail0223@gmail.com
 * 懒汉模式
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
