package com.java.design.mode.Adapter.clazz;

/**
 * className: Demo
 * description: 类适配器
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:10
 * version: 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.play("mp3", "auto.mp3");
        mp3Player.play("mp4", "auto.mp4");
    }

}
