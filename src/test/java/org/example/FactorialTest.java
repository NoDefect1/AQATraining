package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, new Factorial().calculate(0));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, new Factorial().calculate(5));
    }

    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Factorial().calculate(-1));
    }
}