package com.bootcamp.javacode.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Calculators {
  
  public static int add(int x, int y) { // UNIT
    // we need to define the signature before defining the test cast
    return x + y;
  }

  // Unit Test: From calculate() method perspective, 
  // we don't need to know what exactly add() method performs
  // when p = 10, and assume add() return 3, than calculate() return 7
  public int calculate(int p) { // UNIT
    return addition(p, p / 2) + p + 4;
  }

  public int addition(int x, int y) { // UNIT
    return x + y;
  }  

  // ascending order
  public static List<Integer> sort(int[] arr) {
    //return null;
    List<Integer> result = 
      Arrays.stream(arr).boxed().collect(Collectors.toList());
      Collections.sort(result);
      return result;
  }

}
