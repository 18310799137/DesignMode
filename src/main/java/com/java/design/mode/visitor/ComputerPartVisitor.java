package com.java.design.mode.visitor;

/**
 * description: 声明访问者接口
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/17 11:14
 * version: 1.0
 **/
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}