package com.java.design.mode.visitor;

/**
 * description: 创建被访问者的实现
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/17 11:17
 * version: 1.0
 **/
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}