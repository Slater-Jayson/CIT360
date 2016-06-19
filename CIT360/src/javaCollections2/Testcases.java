package javaCollections2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testcases {
	public List<String> myArray() {
        List<String> ar = new ArrayList<>();
        ar.add("Customer1");
        ar.add("Customer2");
        ar.add("Customer3");
        return ar;
    }
}

class TestcasesTest {
    @Test
    public void testMyArray() {
        Testcases testcases = new Testcases();
        assertEquals(Arrays.asList("Customer1", "Customer2", "Customer3"), testcases.myArray());
    }
}

