package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    void testLessThan() {
        assertTrue(new NumberComparator().compare(3, 5) < 0);
    }

    @Test
    void testEqual() {
        assertEquals(0, new NumberComparator().compare(7, 7));
    }

    @Test
    void testGreaterThan() {
        assertTrue(new NumberComparator().compare(9, 5) > 0);
    }
}
