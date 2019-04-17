package com.java.design.mode.Adapter.clazz;


/**
 * className: MP4Player
 * description: 创建适配目标实现类
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:03
 * version: 1.0
 **/
public class MP4Player implements AdvanceMediaPlayer {


    @Override
    public void mp4play(String fileName) {
        System.out.println("MP4PLAY:"+fileName);
    }
}
