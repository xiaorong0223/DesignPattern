package com.codingsnail.designpattern.observer;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/**
 * Created by Snail on 12/18/2017 7:18 PM
 * Contact with slowsnail0223@gmail.com
 */
public class ListenerManager {

    public static final HashMap<String, WeakReference<AccountListener>> accountListeners = new HashMap<>();

    public static void registerAccountListener(String key, AccountListener listener) {
        synchronized (accountListeners) {
            WeakReference<AccountListener> ref = accountListeners.get(key);
            if (ref != null && ref.get() != null) {
                ref.clear();
            }
            accountListeners.put(key, new WeakReference<>(listener));
        }
    }


    public static void unregisterAccountListener(String key) {
        synchronized (accountListeners) {
            WeakReference<AccountListener> ref = accountListeners.get(key);
            if (ref != null && ref.get() != null) {
                ref.clear();
            }
            accountListeners.remove(key);
        }
    }
}
