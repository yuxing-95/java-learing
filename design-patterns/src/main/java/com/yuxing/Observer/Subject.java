package com.yuxing.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式（Observer Pattern）定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 当一个对象的状态发生变化时，所有依赖于它的对象都会收到通知并自动更新。这种模式主要用于实现分布式事件处理系统。
 * 优点：
 * 1. 被观察者和观察者之间是抽象耦合的；
 * 2. 耦合度较低，两者之间的关联仅仅在于消息的通知；
 * 3. 被观察者⽆需关⼼他的观察者；
 * 4. ⽀持⼴播通信；
 * 缺点：
 * 1. 观察者只知道被观察对象发⽣了变化，但不知变化的过程和缘由；
 * 2. 观察者同时也可能是被观察者，消息传递的链路可能会过⻓，完成所有通知花费时间较多；
 * 3. 如果观察者和被观察者之间产⽣循环依赖，或者消息传递链路形成闭
 * 环，会导致⽆限循环；
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
