package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] DataArray = { //Некорректное количество столбцов и строк, невалидные данные в значениях
                {"1", "2", "3", "4",},
                {"5", "7", "7", "8", "u"},
                {"9", "10", "11", "0"},
                {"13", "14", "15", "16"},
                {"1","2","3"," ","5"}
        };

        try {
            int sum = ArrayProcessor.sumArray(DataArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера:");
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных:");
            System.out.println(e.getMessage());
        }

        // Имитация ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива : " + e.getMessage());
        }
    }
}


