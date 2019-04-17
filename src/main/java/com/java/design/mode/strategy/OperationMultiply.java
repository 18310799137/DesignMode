package com.java.design.mode.strategy;

/**
 * description:创建具体业务实现类
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/17 9:02
 * version: 1.0
 **/
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}