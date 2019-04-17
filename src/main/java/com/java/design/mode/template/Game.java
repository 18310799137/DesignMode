package com.java.design.mode.template;

/**
 * description: 新建抽象类模板,并声明抽象方法
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/17 10:48
 * version: 1.0
 **/
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}