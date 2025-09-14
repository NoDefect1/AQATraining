package org.example.two;

public interface RectangleShape extends Shape {
    double getWidth();
    double getHeight();

    @Override
    default double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    default double getArea() {
        return getWidth() * getHeight();
    }
}
