package com.yuxing.Factory;

import com.yuxing.Factory.impl.Circle;
import com.yuxing.Factory.impl.Rectangle;

/**
 * .
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class ShapeFactoryAbstract extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
