import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  
  public static void main(String[] args) {
    // Predicate
    // Consumer

    List<String> strings = new ArrayList<>();
    strings.add("DEF");
    strings.add("xyzabc");
    strings.add("ABC");
    strings.add("ABC");
    
    int total = 0;
    //int yr = 0;
    int sum = 4;

    for (String s : strings) {
      if (s.length() <= 3) {
        System.out.println(s);
       total += s.length();
      }      
    }

    //sum = 4;
    // after Java 8
    //Predicate<String> shorterThanThree = x -> x.length() <= 3;
    strings.stream() // List<String> -> Stream<String>
      //.filter(shorterThanThree);
      //.filter(str -> str.length() <= 3) // intermediate operation
      //.filter(s -> s.startsWith("xyz")) // intermediate operation
      .filter(s -> s.length() <= 3 && s.startsWith("xyz") && sum >= 0) // intermediate operation
      .forEach(str -> { // terminate operation
        System.out.println(str);
        // total += str.length(); //stream does not allow "Write" operation on the variables outside the stream scope
      });

      // Stream will wait terminate operation to start intermediate operation

      Stream<String> ss = strings.stream().filter(s -> s.charAt(2) == 'F');
      System.out.println(strings.size()); // 3
      System.out.println(ss); // java.util.stream.ReferencePipeline$2@38af3868
      System.out.println(ss.count()); // 1, terminate operation

      // Convert Data Structure: List -> Set
      //Set<String> ss2 = new HashSet<>();

      Set<String> ss2 = strings.stream() //
        .filter(s -> s.length() <= 3) // 
        .collect(Collectors.toSet()); // HashSet Object

      System.out.println(ss2.getClass());
      ss2.stream().forEach(str -> {
        System.out.println(str);
      });

      //Map<Integer, String> map1 = new HashMap<>();

      List<String> ns = strings.stream()
        .filter(s -> s.length() > 3)
        .map(s -> {
          return s.concat("hello");
          //return "hello";
        //}).toList();
        }).collect(Collectors.toList());
        System.out.println(ns);
        
        // ns.stream()
        //   .forEach(s -> {
        //     System.out.println(s);
        //   });
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(15);
        numbers.add(87);
        numbers.add(6);

        Set<String> numbers2 = numbers.stream()
        .map(num -> {
          return String.valueOf(num);
          //return num + 873;
        })
        .collect(Collectors.toSet());
  }

}
