package com.codingsnail.designpattern.observer;

/**
 * Created by Snail on 12/18/2017 7:19 PM
 * Contact with slowsnail0223@gmail.com
 * 用户Listener
 */
public interface AccountListener {

    /**
     * 用户登录回调
     */
    void onAccountLogin();

    /**
     * 用户退出登录回调
     */
    void onAccountLogout();
}
