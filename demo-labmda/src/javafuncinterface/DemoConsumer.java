package javafuncinterface;

import java.util.function.Consumer;

public class DemoConsumer {

  public static void main(String[] args) {
    // void accept(T t)
    Consumer<Person> c = (p) -> {
      System.out.println(p.getName());
    };

    // We can skip the () if there is only one parameter p
    Consumer<Person> printName = p -> {
      System.out.println(p.getName());
    };

    //Person person1 = new Person("John");
    printName.accept(new Person("John"));
  }
  
}
