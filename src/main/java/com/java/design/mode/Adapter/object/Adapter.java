package com.java.design.mode.Adapter.object;

/**
 * className: Adapter
 * description: 定义适配器实现了被适配接口,并传递目标接口的引用
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:40
 * version: 1.0
 **/
public class Adapter implements Fruit {

    Vegetables vegetables;

    public Adapter(Vegetables vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public void eat() {
        vegetables.color();
    }
}
