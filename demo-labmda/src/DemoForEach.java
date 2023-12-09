import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {
  public static void main(String[] args) {
    String[] strings = new String[] {"abc", "def", "ijk"};

    // For-each supports array and List
    for (String s : strings) {
      System.out.println(s);
    }

    // Just of read, update. Cannot add or remove
    List<String> list1 = List.of("abc", "def", "ijk"); 
    List<String> list2 = new ArrayList<>(List.of("abc", "def", "ijk"));
    // list2.add("abc");
    // list2.add("def");
    // list2.add("ijk");
    for (String s : list2) {
      System.out.println(s);
    }


    Consumer<String> consumer = new Sysout();
    list2.forEach(new Sysout());

    Consumer<String> consumer2 = x -> System.out.println("hello " + x);
    list2.forEach(consumer2);


    // Consumer means, return nothing
    // Consumer: x -> ()
    list2.forEach(x -> {
      System.out.println("Hello " + x);
    });

    



  }

}
