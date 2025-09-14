package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2025",
                "Apple Inc.", "USA", 6999, false);
        productsArray[2] = new Product("Xiaomi 15", "10.08.2025",
                "Xiaomi Corp.", "China", 3999, true);
        productsArray[3] = new Product("Sony WH-1000XM6", "05.07.2025",
                "Sony", "Japan", 1299, false);
        productsArray[4] = new Product("Dell XPS 15", "20.06.2025",
                "Dell", "USA", 8999, true);

        System.out.println("=== Список товаров ===");
        for (Product product : productsArray) {
            product.printInfo();
        }


        Park park = new Park("Парк Горького");
        Park.Attraction wheel = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 15.0);
        Park.Attraction coaster = park.new Attraction("Американские горки", "11:00 - 21:00", 25.0);
        Park.Attraction carousel = park.new Attraction("Карусель", "10:00 - 20:00", 8.0);

        System.out.println("=== Аттракционы парка " + park + " ===");
        wheel.printInfo();
        coaster.printInfo();
        carousel.printInfo();
    }
}