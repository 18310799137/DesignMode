package com.java.design.mode.template;

/**
 * description: 模板模式
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/17 10:48
 * version: 1.0
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();


        game = new Football();
        game.play();
    }
}