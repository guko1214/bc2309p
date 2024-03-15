package com.vtxlab.bootcamp;

public class Object1 {
  public static void main(String[] args) {
    Object father = new Father();
    Father father2 = (Father) father;
    System.out.println(father);
    System.out.println(father2);

    Object something = createFather(3);
    //Dog dog = (Dog) something;
    if (something instanceof Dog) {
      Dog dog = (Dog) something;
    } else if (something instanceof Father) {
      Father father3 = (Father) something;
    }

  }

  public static Object createFather(int x) {
    if (x % 2 == 0)
      return new Father();
    else
      return new Dog();
  }
 
}
