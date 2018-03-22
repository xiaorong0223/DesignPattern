package com.codingsnail.designpattern.builder;

/**
 * Created by Snail on 3/22/2018 8:59 PM
 * Contact with slowsnail0223@gmail.com
 */
public abstract class Builder {

    public abstract void buildCpu(String cpu);
    public abstract void buildDisplay(String display);
    public abstract void buildOs();

    public abstract Phone create();
}
