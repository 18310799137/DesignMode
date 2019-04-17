package com.java.design.mode.Adapter.clazz;


/**
 * className: Adapter
 * description: 定义适配器类,继承目标类并实现被适配接口
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/11 12:06
 * version: 1.0
 **/
public class Adapter extends MP4Player implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")) {
            new Mp3Player().play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4play(fileName);
        }
    }
}
