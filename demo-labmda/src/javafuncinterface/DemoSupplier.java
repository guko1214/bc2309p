package javafuncinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class DemoSupplier {


  public static void main(String[] args) {
    // T get();
    Supplier<Person> person = () -> {
      return new Student(1, "John");
    };

    Supplier<List<String>> linkedList = () -> {
      return new LinkedList<>(List.of("abc","def","ijk"));
    };

    Supplier<List<String>> arrayList = () -> {
      return new ArrayList<>(List.of("abc","def","ijk"));
    };

    List<String> ll = linkedList.get();
    ll.add("Hello");
  }
}
