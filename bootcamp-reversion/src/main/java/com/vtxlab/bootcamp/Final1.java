package com.vtxlab.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Final1 {
  
  private static final int x1 = 3;
  private static int x2 = 3;
  private final int x3 = 3;
  private int x4 = 3;

  // This to "final" address, so that you cannot change the object (i.e. LinkedList)
  private static final List<String> strings = new ArrayList<>();

  public void setX4(int x4) {
    this.x4 = x4;
  }

  public static void main(String[] args) {
    Final1 f1 =new Final1();
    f1.setX4(10);

    // x1
    //x1 = 2; // Error, final
    System.out.println(x1 + 2);

    // x2
    x2 = 2;
    System.out.println(Final1.x2 + 2);

    // x3
    Final1 f2 = new Final1();
    // f2.x3 = 4; // Error, final
    System.out.println(f2.x3 + 2); // 5

    System.out.println(strings);
    strings.add("Tommy");
    strings.add("Thomas");
    System.out.println(strings);
    strings.remove(0);
    System.out.println(strings);
  }
}
