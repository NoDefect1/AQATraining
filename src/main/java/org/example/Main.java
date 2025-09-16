package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "X", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = ArrayProcessor.sumArray(correctArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int sum = ArrayProcessor.sumArray(wrongDataArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Пример генерации и поимки ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Ошибка: индекс за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
