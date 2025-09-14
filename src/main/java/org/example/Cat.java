package org.example;

public class Cat extends Animal {
    private static int catCount = 0;
    private final int MAX_RUN = 200;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            satiety = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не стал есть — еды недостаточно.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}
