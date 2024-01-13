package com.bootcamp.javacode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class TestInstancePerClassTest {
  
  private int x;

  @BeforeAll
  void init() {
    this.x = 10;
  }

  @AfterAll
  void afterallTest() {
    System.out.println("hello......afterall");
  }

  @Test
  @Order(2)
  public void testA() {
    this.x++;
    assertEquals(12, this.x);
  }

  @Test
  @Order(1)
  public void testB() {
    this.x++;
    assertEquals(11, this.x);
  }

  public static void main(String[] args) {
    // TestInstancePerClass t1 =new TestInstancePerClass();
    // t1.testA();
    // t1.testB();
  }


}
