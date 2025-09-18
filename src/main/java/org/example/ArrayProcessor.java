package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayProcessor {

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        List<String> errors = new ArrayList<>();
        int sum = 0;

        if (arr.length != 4) {
            errors.add("Неверное количество строк: " + arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                errors.add("Неверное количество столбцов в строке " + i + ": " + arr[i].length);
            }

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    errors.add("Ошибка данных в ячейке [" + i + "][" + j + "]: " + arr[i][j]);
                }
            }
        }

        if (!errors.isEmpty()) {
            String report = String.join("\n", errors);

            boolean hasSizeError = errors.stream().anyMatch(msg ->
                    msg.startsWith("Неверное количество строк") || msg.startsWith("Неверное количество столбцов"));

            if (hasSizeError) {
                throw new MyArraySizeException(report);
            } else {
                throw new MyArrayDataException(report);
            }
        }

        return sum;
    }
    }