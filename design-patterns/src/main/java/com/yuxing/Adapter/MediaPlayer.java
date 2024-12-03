package com.yuxing.Adapter;

/**
 * 目标接口是客户所期待的接口。
 * 适配器模式相当于我从一个接口调用另一个已经实现另一个接口的方法
 * 优点：
 * 1. 提⾼了类的复⽤；
 * 2. 组合若⼲关联对象形成对外提供统⼀服务的接⼝；
 * 3. 扩展性、灵活性好
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
