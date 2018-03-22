package com.codingsnail.designpattern.builder;

/**
 * Created by Snail on 3/22/2018 8:51 PM
 * Contact with slowsnail0223@gmail.com
 */
public abstract class Phone {

    protected String mCpu;
    protected String mOs;
    protected String mDisplay;

    protected Phone() {
    }


    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setmOs();
}
