package com.codingsnail.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Snail on 12/6/2017 11:20 AM
 * Contact with slowsnail0223@gmail.com
 * 容器单例模式
 */
public class MapSingleton {

    private static Map<String, Object> map = new HashMap<>();

    private MapSingleton() {
    }

    public static void registerSingleton(String key, Object instance) {
        if (!map.containsKey(key)) {
            map.put(key, instance);
        }
    }

    public static Object getSingleton(String key) {
        return map.get(key);
    }
}
