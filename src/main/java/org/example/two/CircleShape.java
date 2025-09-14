package org.example.two;

public interface CircleShape extends Shape {
    double getRadius();

    @Override
    default double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    default double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
