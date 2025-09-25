package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(calc.add(3, 4), 7);
    }

    @Test
    public void testSubtract() {
        assertEquals(calc.subtract(3, 4), -1);
    }

    @Test
    public void testMultiply() {
        assertEquals(calc.multiply(3, 4), 12);
    }

    @Test
    public void testDivide() {
        assertEquals(calc.divide(5, 2), 2.5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZeroThrows() {
        calc.divide(1, 0);
    }
}
