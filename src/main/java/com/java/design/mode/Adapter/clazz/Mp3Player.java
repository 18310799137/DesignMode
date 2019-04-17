package com.java.design.mode.Adapter.clazz;

/**
 * className: Mp3Player
 * description: 定义适配实现类
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:04
 * version: 1.0
 **/
public class Mp3Player implements MediaPlayer {


    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equals(audioType)){
            System.out.println("mp3 play:"+fileName);
        }else if ("mp4".equals(audioType)){
            Adapter adapter = new Adapter();
            adapter.play(audioType, fileName);
        }
    }
}
