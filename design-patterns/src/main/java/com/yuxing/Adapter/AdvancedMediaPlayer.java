package com.yuxing.Adapter;

/**
 * 被适配的接口有不同的方法签名，这使得它与目标接口不兼容。
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
