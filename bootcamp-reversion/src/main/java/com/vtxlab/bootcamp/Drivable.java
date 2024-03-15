package com.vtxlab.bootcamp;

public interface Drivable {

  int x = 3; //  public static final
  
  void drive(); // public

  // default
  default void sleep() {
    System.out.println("Sleeping ...");
  }

  // static
  static void eat() {
    System.out.println("Eating ....");
  }

  public static void main(String[] args) {
    Drivable.eat();
    Father father = new Father();
    Drivable driver = new Father();
  }

}
