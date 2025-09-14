package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");

        dog1.run(150);
        dog2.swim(8);
        cat1.run(250);
        cat2.swim(5);

        System.out.println("\n=== Кормим котов ===");
        Bowl bowl = new Bowl(20);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 7);
        }

        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isSatiety() ? "Сыт" : "Голоден"));
        }

        System.out.println("\n=== Статистика ===");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());
    }
}
