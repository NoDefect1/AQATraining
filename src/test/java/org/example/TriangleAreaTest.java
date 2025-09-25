package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaTest {

    @Test
    public void testSimpleArea() {
        assertEquals(new TriangleArea().calculate(10, 5), 25.0);
    }

    @Test
    public void testFractionalArea() {
        assertEquals(new TriangleArea().calculate(2.5, 3.2), 4.0, 1e-9);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testZeroBaseThrows() {
        new TriangleArea().calculate(0, 5);
    }
}

