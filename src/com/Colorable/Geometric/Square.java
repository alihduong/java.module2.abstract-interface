package com.Colorable.Geometric;

import com.Colorable.Interface.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square(double size) {
        super(size, size);

    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        super.setWidth(size);
        super.setLength(size);

    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public double getArea() {
        return getSize() * getSize();
    }

    @Override
    public double getPerimeter() {
        return getSize() * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
