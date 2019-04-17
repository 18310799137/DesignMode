package com.java.design.mode.observer;

/**
 * className:ObserverPatternDemo
 * description: 观察者模式测试
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/16 11:30
 * version: 1.0
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}