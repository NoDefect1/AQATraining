package org.example.two;

public interface TriangleShape extends Shape {
    double getA();
    double getB();
    double getC();

    @Override
    default double getPerimeter() {
        return getA() + getB() + getC();
    }

    @Override
    default double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
    }
}
