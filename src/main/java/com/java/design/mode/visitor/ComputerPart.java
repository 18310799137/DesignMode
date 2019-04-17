package com.java.design.mode.visitor;

/**
 * description:声明被访问者的接口
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/17 11:16
 * version: 1.0
 **/
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}