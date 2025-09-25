package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest {

    @Test
    public void testCompare() {
        NumberComparator nc = new NumberComparator();
        assertEquals(nc.compare(5, 3), 1);
    }
}
