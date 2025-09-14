package org.example.two;

public interface Shape {
    String getFillColor();
    String getBorderColor();
    double getArea();
    double getPerimeter();

    default String format(double value) {
        return String.format("%.2f", value);
    }

    default void printInfo() {
        String shapeName = this.getClass().getSimpleName(); // получаем имя класса (Circle, Rectangle, Triangle)
        System.out.println("Периметр " + shapeName + ": " + format(getPerimeter()));
        System.out.println("Площадь " + shapeName + ": " + format(getArea()));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }

}
