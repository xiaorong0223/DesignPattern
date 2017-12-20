package com.codingsnail.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Snail on 12/20/2017 5:34 PM
 * Contact with slowsnail0223@gmail.com
 * 单身男士-订阅 微信公众号"面向对象"
 * 单身男士作为观察者
 */
public class SingleManObserver implements Observer {

    private Observable observable;
    private MsgInfo msgInfo;

    public SingleManObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object obj) {
        // push的方式获取
        if (obj instanceof MsgInfo) {
            this.msgInfo = (MsgInfo) obj;
            readMessage(msgInfo);
            contact(msgInfo);
        }

        //pull的方式
        if (o instanceof SubscribeSubject) {
            this.msgInfo = ((SubscribeSubject) o).getMsgInfo();
            readMessage(msgInfo);
            contact(msgInfo);
        }
    }

    /**
     * 不在订阅获取资料
     */
    public void deleteObserver() {
        observable.deleteObserver(this);
    }

    /**
     * 阅读个人信息
     *
     * @param message 小姐姐个人信息
     */
    private void readMessage(MsgInfo message) {
    }

    /**
     * 联系小姐姐
     *
     * @param message 小姐姐个人信息
     */
    private void contact(MsgInfo message) {
    }
}
