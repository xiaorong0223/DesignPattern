package com.codingsnail.designpattern.singleton;

/**
 * Created by Snail on 12/6/2017 10:54 AM
 * Contact with slowsnail0223@gmail.com
 * 懒汉模式 方法同步锁
 */
public class LazySafetySingleton {

    private static LazySafetySingleton instance;

    private LazySafetySingleton() {
    }

    public static synchronized LazySafetySingleton getInstance() {
        if (instance == null) {
            instance = new LazySafetySingleton();
        }
        return instance;
    }
}
