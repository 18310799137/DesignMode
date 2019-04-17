package com.java.design.mode.Adapter.object;

/**
 * className: Tomato
 * description: 创建目标接口的实现
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:40
 * version: 1.0
 **/
public class Tomato implements Vegetables {


    @Override
    public void color() {
        System.out.println(" color is red!");
    }
}
