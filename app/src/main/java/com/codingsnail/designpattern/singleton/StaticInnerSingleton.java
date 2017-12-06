package com.codingsnail.designpattern.singleton;

/**
 * Created by Snail on 12/6/2017 10:56 AM
 * Contact with slowsnail0223@gmail.com
 * 静态内部类
 */
public class StaticInnerSingleton {


    private StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
}
