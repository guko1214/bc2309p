package com.bootcamp.javacode;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // By default
public class TestInstanceTest {
  
  private int x;

  private List<String> string;

  @BeforeEach
  void init() {
    this.x = 20;
    //this.string = List.of({1,23,3});
  }  

  @AfterEach
  void afterallTest() {
    System.out.println("hello......aftereach");
  }


  @Test
  void testMethod1() {
    this.x++;
    assertEquals(21, this.x);
  }

  @Test
  void testMethod2() {
    this.x++;
    assertEquals(21, this.x);
  }

  public static void main(String[] args) {
    // Test run like below, a new object is created each time
    TestInstanceTest t1 = new TestInstanceTest();
    t1.testMethod1();

    TestInstanceTest t2 = new TestInstanceTest();
    t1.testMethod2();
  }

}
