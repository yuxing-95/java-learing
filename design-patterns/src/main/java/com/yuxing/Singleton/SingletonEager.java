package com.yuxing.Singleton;

/**
 * 饿汉式单例模式.
 * 饿汉式单例模式，顾名思义，类⼀加载就创建对象，这种⽅式⽐较常⽤，
 * 但容易产⽣垃圾对象，浪费内存空间。
 * 优点：线程安全，没有加锁，执⾏效率较⾼
 * 缺点：不是懒加载，类加载时就初始化，浪费内存空间
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();
    //私有空构造器
    private SingletonEager() {
    }

    //静态方法获取
    public static SingletonEager getInstance() {
        return instance;
    }
}
