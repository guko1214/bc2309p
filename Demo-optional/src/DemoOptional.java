//package demo-optional;

import java.util.Optional;

public class DemoOptional {
  
  public static void main(String[] args) {
    String s = null;

    Optional<String> os = Optional.ofNullable(null);
    Optional<String> os2 = Optional.empty();
    
    if (os.isPresent()) {
      System.out.println(os.get());
    } else {
      //System.out.println(os.get());
      System.out.println("os's string is a null value");
    }

    if (os2.isPresent()) { // os2 is not null, but os2's value is null
      System.out.println("os2 present");
    } else {
      System.out.println("os2 is not preent");
    }

    Optional<String> os3 = Optional.ofNullable("John");

    os3.ifPresent(e -> {
      System.out.println(e);
    });

    // ofNullable() vs of() // 
    // Optional<Integer> oi = Optional.of(null);  // error, Optional.of() cannot store null

    // if (oi.isPresent()) {
    //   System.out.println("present");
    // }
    Optional<Integer> oi = Optional.of(10); // auto-box
    System.out.println(oi.getClass());



  }
}
