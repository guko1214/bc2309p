package com.bootcamp.javacode;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bootcamp.javacode.model.Calculators;


// File name has to be XXXXTest.java or XXXXTests.java
// Otherwise, mvn cannot locate the test files.
public class CalculatorsTests {
    @Test
    public void testAdd() {
      Assertions.assertEquals(7, Calculators.add(3,4));
      Assertions.assertEquals(-11, Calculators.add(-1,-10));
      Assertions.assertEquals(0, Calculators.add(0, 0));
      //Assertions.assertEquals(5, Calculators.add(0, -3));
      Assertions.assertEquals(-3, Calculators.add(0, -3));
      //Assertions.assertEquals(4, Calculators.add(8, -3));
    }

    @Test
    public void testSort() {
      Assertions.assertEquals(new ArrayList<>(List.of(1,2,3)),
                              Calculators.sort(new int[] {1,3,2}));
      //Assertions.assertEquals(new ArrayList<>(List.of(1,2)),
        //                      Calculators.sort(new int[] {1,3,2}));                              
      Assertions.assertEquals(new ArrayList<>(List.of(-2,-1,-1)),
                              Calculators.sort(new int[] {-2,-1,-1}));
      Assertions.assertEquals(new ArrayList<>(List.of(0)),
                              Calculators.sort(new int[] {0}));
      Assertions.assertEquals(new ArrayList<>(List.of(0,1,3,7,9)),
                              Calculators.sort(new int[] {3,9,0,7,1}));
    }
}
