package com.vtxlab.bootcamp;

public class Array1 {

  
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3};
    
    int[] arr2 = new int[3];
    arr2[0] = 1;
    arr2[1] = 2;
    arr2[2] = 3;

    int[] arr3 = {1,2,3}; // not recommend!!! java developer seldom use

    // for (int i = 0; i < arr.length; i++) {

    // }

    // for (int i : arr) {

    // }

    addOne(arr); // pass by reference
    print(arr); // 2 3 4

    Integer i9 = addOne(5);
    System.out.println("i9=" + i9);

    String s9 = "Hello";
    //String s9 = addOne("Hello");
    addOne(s9);
    System.out.println("s9=" + s9);

  }

  public static void print(int[] arr) {
    for (int i : arr) {
      System.out.println(arr[i]);
    }
  }

  public static Integer addOne(Integer integer) { // pass by value (Wrapper Class)
    return integer + 1;
  }

  public static void addOne(String str) { // pass by value (Wrapper Class)
    //return str + "1";
    str.concat("1");
  }

  public static void addOne(int[] arr) { // pass by reference (Array or Custom Class)
      for (int i = 0; i < arr.length; i++) {
        arr[i]++;
      }
  }

}
