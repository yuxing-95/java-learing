package com.yuxing.Factory;

/**
 * 工厂生成器类
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactoryAbstract();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactoryAbstract();
        }
        return null;
    }
}
