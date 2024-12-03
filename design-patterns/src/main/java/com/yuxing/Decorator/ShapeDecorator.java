package com.yuxing.Decorator;

import com.yuxing.Factory.Shape;

/**
 * 装饰器类
 *
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 这种模式创建了一个装饰类，用来包装原类，并在保持类方法签名完整的前提下，提供了额外的功能。
 *  许多编程语⾔使⽤ final 最终关键字来限制对某个类的进⼀步扩展。 复⽤
 * 最终类已有⾏为的唯⼀⽅法是使⽤装饰模式： ⽤封装器对其进⾏封装。
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
