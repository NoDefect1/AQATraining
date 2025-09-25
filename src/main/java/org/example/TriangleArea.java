package org.example;

public class TriangleArea {

    // IllegalArgumentException если основание <= 0 или высота <= 0
    public double calculate(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть > 0");
        }
        return 0.5 * base * height;
    }
}