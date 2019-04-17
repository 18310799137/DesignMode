package com.java.design.mode.Adapter.interfaces;

/**
 * className: MessageCaller
 * description: 定义适配器目标类继承抽象适配器类,实现必须实现的接口
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:46
 * version: 1.0
 **/
public class MessageCaller extends MessageAdapter {

    @Override
    public void length() {
        System.out.println("length");
    }

    @Override
    public void type() {
        System.out.println("type");
    }
}
