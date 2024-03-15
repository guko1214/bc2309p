package com.vtxlab.bootcamp.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import com.vtxlab.bootcamp.Drivable;

public class Mother implements Drivable , Eatable, Comparable<Mother> {

  private int age;

  Mother() {

  }
  Mother(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
  @Override
  public String toString() {
    return "Mother(" //
    + "age=" + this.age + ")";
  }

  @Override
  public int compareTo(Mother mother) { // instance method
    return Integer.compare(this.age, mother.getAge());
  }


  @Override
  public void drive() {
    System.out.println("Original Mother Object - drive()");
  }

  @Override
  public void eat() {
    System.out.println("Original Mother Object - eat()");
  }

  public static void main(String[] args) {
    
    Drivable mother = new Mother(0);
    mother.drive();
    // mother.eat();
    Mother mother3 = (Mother) mother;

    mother3.eat();
    mother3.drive();

    Drivable mother2 = () -> System.out.println("driving"); // An Object wiht drive() implementation
    mother2.drive();
    // Eatable mother3 = new Mother();
    // mother3.eat(); 

    // Mother mother4 = (Mother) mother2; // Runtime Exceptin ClassCastException // cannot cast to Mother since it is Object with Drivable interface only
    // mother4.drive(); 
    // mother4.eat();

    // Sorting
    List<Mother> mothers = 
        new ArrayList<>(List.of(new Mother(10), new Mother(13), new Mother(6)));
    // Approach 1 ()
    Comparable<Mother> mother5 = new Mother(0);
    Collections.sort(mothers);
    System.out.println(mothers); // [Mother(age=6), Mother(age=10), Mother(age=13)]

    // Approach 2 (Lambda)

    //Comparable<Mother> sortByAgeDesc = m1 -> 2;
    //Comparator<Mother> sortByAgeDesc = (m1, m2) -> Integer.compare(m2.getAge(),m1.getAge());
    Comparator<Mother> sortByAgeDesc = (m1, m2) ->  
    {
      if (m1.getAge() > m2.getAge())
        return -1;
      return 1;
    };
    Collections.sort(mothers, sortByAgeDesc);
    System.out.println(mothers); // [Mother(age=13), Mother(age=10), Mother(age=6)]

    // Stream
    List<Mother> motherList = mothers.stream() // from List to stream
      .filter(e -> e.getAge() > 8)
      //.map(e -> new Mother(e.getAge()))
      .collect(Collectors.toList()); // "new" an Array list. how about mother objects?

    System.out.println(motherList); // [Mother(age=13), Mother(age=10)]  

    motherList.remove(0);

    System.out.println(motherList); // [Mother(age=10)]

    System.out.println(System.identityHashCode(motherList.get(0)));
    System.out.println(System.identityHashCode(mothers.get(1)));

    HashMap<String, Mother> hashMap = new HashMap<>();
    hashMap.put("123",motherList.get(0));
    hashMap.put("124",new Mother(10));

    System.out.println(System.identityHashCode(hashMap.get("123")));
    System.out.println(System.identityHashCode(hashMap.get("124")));

    System.out.println(System.identityHashCode(motherList)); // different
    System.out.println(System.identityHashCode(mothers)); // different

    // stream.map(): mother object -> Integer object
    List<Integer> motherAgeList = mothers.stream()
      .map(e -> e.getAge())
      .sorted()
      .collect(Collectors.toList());
    System.out.println(motherAgeList);

      

  }

}