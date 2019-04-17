package com.java.design.mode.observer;

/**
 * description: 定义观察者接口
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/16 11:26
 * version: 1.0
 **/
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}