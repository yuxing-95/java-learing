package com.yuxing.Singleton;

/**
 * 双重检查加锁单例模式.
 * 双重检查锁定结合了饿汉式和懒汉式的优点，在第一次调用时创建实例，并且保证线程安全，性能也较好。
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked instance;

    private SingletonDoubleChecked(){}

    //
    public static SingletonDoubleChecked getInstance() {
        if(instance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if(instance == null) {
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
