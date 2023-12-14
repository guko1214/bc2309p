import java.util.ArrayList;
import java.util.Comparator;
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
      System.out.println(numbers);

      Set<String> numbers2 = numbers.stream()
      .map(num -> {
        return String.valueOf(num);
        //return num + 873;
      })
      .collect(Collectors.toSet());
      System.out.println(numbers2);


      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Jenny",13));
      persons.add(new Person("Oscar",20));
      persons.add(new Person("Wendy",30));

      // stream.map() -> ["Jenny","Oscar", "Wendy"]
      List<String> names = persons.stream()
      .map(e -> e.getName())
      .collect(Collectors.toList());
      System.out.println(names); // ["Jenny", "Oscar", "Wendy"]

      List<BookStore> bookStores = new ArrayList<>();
      bookStores.add(new BookStore("Wendy", List.of("ABC", "AAA")));
      bookStores.add(new BookStore("Jenny", List.of("BAC", "AAA","XYZ")));

      // StoreOwner
      List<StoreOwner> owners = persons.stream() //
      .filter(p -> {
        for (BookStore bs : bookStores) {
          if (p.getName().equals(bs.getOwner())) {
            return true;
          }
        }
        return false;
      })
      .map(e -> { // e is a person object 
        for (BookStore bs : bookStores) {
          if (e.getName().equals(bs.getOwner())) {
            return new StoreOwner(bs.getOwner(),e.getAge(), bs.getBooks());
          }
        }
        return null;
      })
      .collect(Collectors.toList());
      System.out.println(owners);

      // Find the List<String> names, who has a bookstore, and contain the "AAA" book
      List<String> nameList = persons.stream()
      .filter(p -> {
        for (BookStore bs : bookStores) {
          if (p.getName().equals(bs.getOwner()) 
              //&& bs.getBooks().contains("AAA")) {
                && bs.getBooks().contains("XYZ")) {
            return true;
          }
        }
        return false;
      }) //
      .map(p -> p.getName()) //
      .filter(str -> str.startsWith("J"))
      .collect(Collectors.toList());

      System.out.println(nameList);

      // sorted()
      List<String> nameList2 = List.of("Jenny","Tommy", "Betty");
      Comparator<String> descendingName = (s1,s2) ->  s2.compareTo(s1);

      nameList2.stream() //
        .sorted(descendingName)
        .forEach(e -> System.out.println(e));


      // Stream.class
      Stream<String> ss3 = Stream.of("ABC","AAA","XYZ","IJK");
      ss3.filter(e -> e.startsWith("A")) //
          .forEach(e -> System.out.println(e));


  }

}
