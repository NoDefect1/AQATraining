package org.example.two;

public class ShapesMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Чёрный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Белый");
        Shape triangle = new Triangle(3, 4, 5, "Жёлтый", "Зелёный");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
