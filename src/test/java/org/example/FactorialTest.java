package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(new Factorial().calculate(0), 1);
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(new Factorial().calculate(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeNumber() {
        new Factorial().calculate(-1);
    }
}

