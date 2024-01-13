package com.bootcamp.javacode;


//import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*; //
import java.time.Duration;
//import static org.junit.jupiter.api.Assertions.assertEquals; //
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.bootcamp.javacode.model.Calculators;
import com.bootcamp.javacode.model.Staff;


// File name has to be XXXXTest.java or XXXXTests.java
// Otherwise, mvn cannot locate the test files.
@DisplayName("Calculator Test Plan")
public class CalculatorsTests {
    @Test
    @DisplayName("Testing add Function")
    public void testAdd() {
      // Assertions.assertEquals(7, Calculators.add(3,4));
      // Assertions.assertEquals(-11, Calculators.add(-1,-10));
      // Assertions.assertEquals(0, Calculators.add(0, 0));
      // //Assertions.assertEquals(5, Calculators.add(0, -3));
      // Assertions.assertEquals(-3, Calculators.add(0, -3));
      // //Assertions.assertEquals(4, Calculators.add(8, -3));
      assertEquals(7, Calculators.add(3,4));
      assertEquals(-11, Calculators.add(-1,-10));
      assertEquals(0, Calculators.add(0, 0));
      //Assertions.assertEquals(5, Calculators.add(0, -3));
      assertEquals(-3, Calculators.add(0, -3));
      //Assertions.assertEquals(4, Calculators.add(8, -3));
      assertNotEquals(-5, Calculators.add(0,-3));

      String str = null;
      assertNull(str);
      assertNotNull(Calculators.add(3,4));
    }

    @Test
    public void testSort() {
      assertEquals(new ArrayList<>(List.of(1,2,3)),
                              Calculators.sort(new int[] {1,3,2}));
      //Assertions.assertEquals(new ArrayList<>(List.of(1,2)),
        //                      Calculators.sort(new int[] {1,3,2}));                              
      assertEquals(new ArrayList<>(List.of(-2,-1,-1)),
                              Calculators.sort(new int[] {-2,-1,-1}));
      assertEquals(new ArrayList<>(List.of(0)),
                              Calculators.sort(new int[] {0}));
      assertEquals(new ArrayList<>(List.of(0,1,3,7,9)),
                              Calculators.sort(new int[] {3,9,0,7,1}));

      assertArrayEquals(new int[]{1,2,3},new int[] {1,2,3});
      //assertArrayEquals(new int[]{1,2,3},new int[] {1,2,3,0});
      assertNotEquals(new int[]{1,2,3},new int[] {1,2,3,0});
      // in above case, compare the object reference (i.e. address) only, should use assertArrayEquals to compare the content of array
      //assertEquals(new int[]{1,2,3},new int[] {1,2,3}); 
    }

    @Test
    @DisplayName("")
    public void testBoolean() {

      assertTrue(5 > 3);
      assertTrue(3 < 5);

      Staff staff = new Staff("John", 18);
      assertTrue(staff.isAdult());
      Staff staff2 = new Staff("Mary", 17);
      assertTrue(!staff2.isAdult());

      assertFalse(staff2.isAdult());

    }

    @Test
    public void testSampleObject() {
      String s = "hello";
      String s2 = "hello";
      assertSame(s,s2);

      String s3 = new String("hello");
      assertNotSame(s2,s3);
    }


    @Test
    public void testThrow() {
      assertThrows(NullPointerException.class, () -> {
        String nullString = null;
        nullString.length();
      });

      assertDoesNotThrow(() -> {
        System.out.println("hello");
      });


      assertTimeout(Duration.ofMillis(2000), () -> {
        Thread.sleep(1500);
      });

    }

    @Test
    public void testA() {
      assertTrue(10 > 5);
    }

    @Test
    public void testB() {
      assertEquals(5, "hello".length());
    }

    @Test
    public void combineTestAandTestB() {
      assertAll(
          () -> assertTrue(10 > 5), 
          () -> assertEquals(5, "hello".length()) //
      );

      // All assertion in assertAll must be pass.
      // assertAll(
      //     () -> assertTrue(10 > 5), 
      //     () -> assertEquals(5, "hellos".length()) //
      // );

    }
 }

