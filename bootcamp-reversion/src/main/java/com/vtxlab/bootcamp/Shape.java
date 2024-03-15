package com.vtxlab.bootcamp;

import java.math.BigDecimal;

public abstract class Shape { // interface -> Lamda, Stream
  
  //use abstract class when you want other know there are common attribute(s)
  private String color;

  abstract double area();

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  // not necessary for every child class to implement totalArea, thus set as static method
  public static double totalArea(Shape[] shapes) {
    BigDecimal sum = BigDecimal.valueOf(0.0);
    for (Shape s : shapes) {
      sum = sum.add(BigDecimal.valueOf(s.area()));
    }
    return sum.doubleValue();
  }
  

}
