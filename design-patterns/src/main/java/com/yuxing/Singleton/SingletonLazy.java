package com.yuxing.Singleton;

/**
 * 懒汉式单例模式.
 * 这种⽅式在单线程下使⽤没有问题，对于多线程是⽆法保证单例的，这⾥
 * 列出来是为了和后⾯使⽤锁保证线程安全的单例做对⽐。
 * 优点：懒加载
 * 缺点：线程不安全
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }}

    public static SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
