package com.yuxing.Flyweight;

/**
 * 享元模式（Flyweight Pattern）是一种结构型设计模式，它通过共享大量细粒度对象的方式减少内存使用。
 * 享元模式主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 享元模式的关键是将对象的状态分为内部状态和外部状态，内部状态是可以共享的，外部状态则是可以变化的。
 *  内部状态
 * Color（颜色）：Circle 对象的颜色是可以共享的，不会随环境变化而变化，因此它是内部状态。
 * 外部状态
 * X 坐标（x）：Circle 对象的 x 坐标是每次使用时可以变化的。
 * Y 坐标（y）：Circle 对象的 y 坐标是每次使用时可以变化的。
 * 半径（radius）：Circle 对象的半径是每次使用时可以变化的。
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}

