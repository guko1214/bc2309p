package com.vtxlab.bootcamp;

public class Father extends GrandFather implements Drivable {
  
  @Override
  public void drive() {

  }
  
  public void cook() {

  }

  public static void main(String[] args) {
    Walkable walkman = new Father();
    Human human = new Father();
    human.move();
    human.eat();
  }

}
