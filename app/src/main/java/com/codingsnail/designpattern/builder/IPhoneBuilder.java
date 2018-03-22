package com.codingsnail.designpattern.builder;

/**
 * Created by Snail on 3/22/2018 9:02 PM
 * Contact with slowsnail0223@gmail.com
 */
public class IPhoneBuilder extends Builder {

    private Phone mPhone = new IPhone() ;

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
