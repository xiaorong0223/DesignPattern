package com.codingsnail.designpattern.builder;

/**
 * Created by Snail on 3/22/2018 9:12 PM
 * Contact with slowsnail0223@gmail.com
 */
public class Director {

    Builder mBuilder = null;

    public Director(Builder builder){
     mBuilder = builder;
    }

    public void construct(String cpu,String display){
        mBuilder.buildCpu(cpu);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
