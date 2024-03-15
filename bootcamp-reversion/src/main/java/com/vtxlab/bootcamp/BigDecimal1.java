package com.vtxlab.bootcamp;

import java.math.BigDecimal;

public class BigDecimal1 {
  
  public static void main(String[] args) {
    System.out.println(0.2 + 0.1); // 0.30000000000000004
    double d1 = 0.2;
    double d2 = 0.1;
    if (d1 + d2 == 0.3) { // 0.30000000000000004
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }
    if (sum(d1, d2) == 0.3) {// 0.3
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }
    double result = sum(2.0, 2.3);

    BigDecimal b1 = new BigDecimal("2.0"); // 2.0
    BigDecimal b2 = BigDecimal.valueOf(2.0);
  }

  public static double sum(double x, double y) {
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }
}
