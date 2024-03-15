package com.vtxlab.bootcamp;

public abstract class Human {

  private int age;

  abstract void move();

  void eat() {
    System.out.println("I am eating ...");
  }
  
}
