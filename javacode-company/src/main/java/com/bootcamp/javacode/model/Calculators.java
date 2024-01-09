package com.bootcamp.javacode.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Calculators {
  
  public static int add(int x, int y) { 
    // we need to define the signature before defining the test cast
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
