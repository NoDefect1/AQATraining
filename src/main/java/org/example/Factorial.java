package org.example;


public class Factorial {

    //IllegalArgumentException если n < 0
    public long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("число должно быть >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

