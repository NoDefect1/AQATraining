package org.example;

public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    @Override
    public String toString() {
        return parkName;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
        }
    }
}
