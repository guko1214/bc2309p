package Exercise;

import Exercise2.Apple;
import Exercise2.Orange;

public class Lemon {
  public static void main(String[] args) {
    Apple apple = new Apple();
    //apple.name; 
    // because the attribute "name" is protected in the class Apple
    // and Lemon.java and Apple.java are in different package (folder)

    // Because Cat.java is package-private
    //Cat cat = new Cat();

    Orange orange = new Orange();

  }
}
