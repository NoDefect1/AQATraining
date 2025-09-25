package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    void testSimpleArea() {
        assertEquals(25.0, new TriangleArea().calculate(10, 5));
    }

    @Test
    void testFractionalArea() {
        assertEquals(4.0, new TriangleArea().calculate(2.5, 3.2), 1e-9);
    }

    @Test
    void testZeroBaseThrows() {
        assertThrows(IllegalArgumentException.class, () -> new TriangleArea().calculate(0, 5));
    }
}
