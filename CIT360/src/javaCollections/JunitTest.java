package javaCollections;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

class TestcasesTest {
    @Test
    public void testMyArray() {
        ListCollections test = new ListCollections();
        assertEquals(Arrays.asList("Roman", "Egyptian", "Norse"), test.myArray());
    }
}
