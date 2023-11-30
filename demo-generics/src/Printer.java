import java.util.ArrayList;
import java.util.List;

public class Printer<T> { //<U><V>
  
  //Integer x;
  private T x;

  public Printer() {

  }

  public Printer(T x) {
    this.x = x;
  }

  public void setX(T x) {
    this.x = x;
  }

  public T getX() {
    return this.x;
  }

  public static void main(String[] args) {
    Printer<String> stringPrinter = new Printer<>();
    Printer<Integer> integerPrinter = new Printer<>();
    Printer<Double> doublePrinter = new Printer<>();
    Printer<Long> LongPrinter = new Printer<>(Long.valueOf(2));

    // before Java 1.5
    // more than one class can add into the list
    List objects = new ArrayList();
    objects.add("abc");
    objects.add(1);
    objects.add(1.0);
    System.out.println(objects);

    // but the method belong to the class cannot called, since the class is declared in runtime
    // no any idea about the object in compile time
    System.out.println(objects.get(0));
    // to call the method, checking which class it is, cast it to the class, then method can be called
    // But the problem is "many classes", not all class can be checked so some class may be skipped
    // then still cause compile error
    if (objects.get(0) instanceof String) {
      String str = (String) objects.get(0);
      str = str.concat("Abc");
      System.out.println(str);
    }
       

  } 

}
