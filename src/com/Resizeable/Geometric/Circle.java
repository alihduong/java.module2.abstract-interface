package com.Resizeable.Geometric;

import com.Resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with Radius= " + getRadius() +
                ", which is subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình tròn bằng " + (getArea() * percent / 100));
    }
}
