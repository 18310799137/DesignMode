package com.java.design.mode.visitor;

/**
 * description: 访问者模式
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/17 10:55
 * version: 1.0
 **/
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}