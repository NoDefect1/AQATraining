package org.example;

public class ArrayProcessor {

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (arr.length != 4) {
            throw new MyArraySizeException("Неверное количество строк: " + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Неверное количество столбцов в строке " + i + ": " + arr[i].length);
            }
        }

        int sum = 0;
        // Проход по элементам
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + arr[i][j]);
                }
            }
        }
        return sum;
    }
}
