package com.codingsnail.designpattern.observer;

/**
 * Created by Snail on 12/18/2017 7:20 PM
 * Contact with slowsnail0223@gmail.com
 */
public interface RefreshListener {


    void onRefresh(int position);

    void onDelete(int position);

    void onAdd(int position);

    void onSign(int position);
}
