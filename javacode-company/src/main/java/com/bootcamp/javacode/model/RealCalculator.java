package com.bootcamp.javacode.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RealCalculator {

    private Calculators calculators;

    public RealCalculator() {
      this.calculators = new Calculators();
    }

    // dependency injection
    public RealCalculator(Calculators calculators) {
      this.calculators = calculators;
    }

  // Unit Test: From calculate() method perspective, 
  // we don't need to know what exactly add() method performs
  // when p = 10, and assume add() return 3, than calculate() return 7
  public int calculate(int p) { // UNIT
    return calculators.addition(p, p / 2) + p + 4;
  }

  public int sleep(int second) {
    int result = this.calculators.addition(second, second / 2);

    for (int i = 0; i < 5; i++) { // 0 - 4
      result += i * 2;
      // 0 * 2 + 1 * 2  + 2 * 2 + 3 * 2 + 4 * 2 = 20
    }

    return result;
  }
  

}
