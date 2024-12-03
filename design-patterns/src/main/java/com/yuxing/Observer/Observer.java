package com.yuxing.Observer;

/**
 * 在⽀付场景下，⽤户购买⼀件商品，当⽀付成功之后三⽅会回调⾃身，在
 * 这个时候系统可能会有很多需要执⾏的逻辑（如：更新订单状态，发送邮
 * 件通知，赠送礼品…），这些逻辑之间并没有强耦合，因此天然适合使⽤
 * 观察者模式去实现这些功能，当有更多的操作时，只需要添加新的观察者
 * 就能实现，完美实现了对修改关闭，对扩展开放的开闭原则。
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
