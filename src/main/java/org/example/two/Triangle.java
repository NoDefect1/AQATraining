package org.example.two;

public class Triangle implements TriangleShape {
    private final double a, b, c;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        if (a <= 0 || b <= 0 || c <= 0) throw new IllegalArgumentException("Стороны должны быть > 0");
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Нарушено неравенство треугольника");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getA() { return a; }

    @Override
    public double getB() { return b; }

    @Override
    public double getC() { return c; }

    @Override
    public String getFillColor() { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}
