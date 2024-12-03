package com.yuxing.Factory.impl;

import com.yuxing.Factory.Shape;

/**
 * .
 *
 * @author : HeYuxing
 * @version : 1.0 2024/7/23
 * @since : 1.0
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
