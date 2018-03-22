package com.codingsnail.designpattern.builder;

/**
 * Created by Snail on 3/22/2018 9:10 PM
 * Contact with slowsnail0223@gmail.com
 */
public class MeiZuBuilder extends Builder{

    private Phone mPhone = new MeiZuPhone();

    @Override
    public void buildCpu(String cpu) {
        mPhone.setmCpu(cpu);
    }

    @Override
    public void buildDisplay(String display) {
        mPhone.setmDisplay(display);
    }

    @Override
    public void buildOs() {

    }

    @Override
    public Phone create() {
        return mPhone;
    }
}
