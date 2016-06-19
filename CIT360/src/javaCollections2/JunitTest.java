package javaCollections2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


class JunitcasesTest {
    @Test
    public void testMyArray() {
        ListCollections test = new ListCollections();
        assertEquals(Arrays.asList("Roman", "Egyptian", "Norse"), test.myArray());
    
   }
}
