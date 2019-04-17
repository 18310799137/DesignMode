package com.java.design.mode.Adapter.object;

/**
 * className: Demo
 * description: 对象适配器测试
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:41
 * version: 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Tomato());
        adapter.eat();
    }

}
