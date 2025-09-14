package org.example;
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        prinColor();
        compareNumbers();
        System.out.println(SumAB(12, 6));
        positivOrNegativ(-1);
        positivOrNegativ(0);
        System.out.println(negTrue(0));
        System.out.println(negTrue(-1));
        System.out.println(negTrue(1));
        outputText("AQA Training", 4);
        System.out.println(leapYear(2000));
        System.out.println(leapYear(2023));
        System.out.println(leapYear(2024));
        invertArr();
        fullAr();
        multiply6by2();
        fillArrDiag();
        fillArr(6,7);
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 14;
        int b = -24;
        int sum = a+b;
        if(sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void prinColor() {
        int value = 101;
        if (value <=0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 14;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static boolean SumAB(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void positivOrNegativ(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean negTrue(int a) {
        return a < 0;
    }
    public static void outputText(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static boolean leapYear(int year) {
        return(year % 4 == 0 && year % 100 !=0) || (year % 400 ==0);
    }
    public static void invertArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void fullAr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void multiply6by2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void fillArrDiag() {
        int size = 9;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] fillArr(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }
}
