package com.bootcamp.javacode.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true) // default is false
@EqualsAndHashCode(callSuper = true) // default is false
@Data
//@Builder // extends will not work, should @SuperBuilder, add both in parent and child class
@SuperBuilder
public class Staff extends Person {
 
  //private String name;

  private int age;

  public Staff(String name, int age) {
    super(name);
    this.age = age;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("John", 8);
    System.out.println(staff.getAge());
    staff.setAge(28);
    System.out.println(staff.getAge());
    // no args constructor
    Staff staff2 = new Staff();
    System.out.println(staff2.getAge());
    staff2.setAge(34);
    System.out.println(staff2.getAge());
    Staff staff3 = new Staff("John", 28);
    // toString()
    System.out.println(staff);
    System.out.println(staff2);
    System.out.println(staff3);
    // equals
    System.out.println(staff.equals(staff));
    System.out.println(staff.equals(staff2));
    System.out.println(staff.equals(staff3));
    System.out.println(staff.hashCode());
    System.out.println(staff2.hashCode());
    System.out.println(staff3.hashCode());

    Staff staff4 = Staff.builder() //
      .name("Steven") //
      .age(30) //
      .build();
    System.out.println(staff4);
  }

}