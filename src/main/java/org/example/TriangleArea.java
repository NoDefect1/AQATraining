package org.example;

/**
 * Класс для вычисления площади треугольника.
 */
public class TriangleArea {

    /**
     * Вычисляет площадь треугольника по формуле 1/2 * base * height.
     * @param base основание (должно быть > 0)
     * @param height высота (должна быть > 0)
     * @return площадь треугольника
     * @throws IllegalArgumentException если base <= 0 или height <= 0
     */
    public double calculate(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be > 0");
        }
        return 0.5 * base * height;
    }
}


