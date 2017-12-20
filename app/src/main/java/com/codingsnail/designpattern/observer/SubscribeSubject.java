package com.codingsnail.designpattern.observer;

import java.util.Observable;

/**
 * Created by Snail on 12/20/2017 5:37 PM
 * Contact with slowsnail0223@gmail.com
 * 单身男士-订阅 微信公众号"面向对象"
 * 面向对象订阅号作为被观察者  Subject
 */
public class SubscribeSubject extends Observable {

    /**
     * 刚发布的小姐姐的个人信息
     */
    private MsgInfo msgInfo;

    public void noticeMan(MsgInfo msgInfo) {
        this.msgInfo = msgInfo;
        //1、首先必须调用 setChanged()标记状态已经改变
        setChanged();
        //2、调用notifyObservers()通知出去
        notifyObservers(msgInfo);  // push的方式
        notifyObservers();  //  pull拉取的方式
    }

    public MsgInfo getMsgInfo() {
        return msgInfo;
    }
}
