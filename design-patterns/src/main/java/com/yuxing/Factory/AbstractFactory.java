package com.yuxing.Factory;

/**
 * 抽象⼯⼚模式通过在 AbstarctFactory 中增加创建产品的接⼝，并在具体⼦
 * ⼯⼚中实现新加产品的创建，当然前提是⼦⼯⼚⽀持⽣产该产品。否则继
 * 承的这个接⼝可以什么也不⼲。
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}
