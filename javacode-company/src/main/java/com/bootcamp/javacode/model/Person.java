package com.bootcamp.javacode.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class Person {
  
  private String name;

  public Person() {

  }

  // public Person(String name) {
  //   this.name = name;
  // }

  public String getName() {
    return this.name;
  }

  public static String concat(String str) {
    return "hello" + str;
  }

}
