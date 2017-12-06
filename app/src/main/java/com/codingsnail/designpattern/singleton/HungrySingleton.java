package com.codingsnail.designpattern.singleton;

/**
 * Created by Snail on 12/6/2017 11:02 AM
 * Contact with slowsnail0223@gmail.com
 * 饿汉模式
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
