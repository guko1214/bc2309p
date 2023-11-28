package Person;

import java.util.List;

interface Swimable {


  int swim();

  //  interface use "extends" but not "implements" in parameter type restriction definition 
  public static <T extends Swimable> int totalMeter(List<T> objects) { 
    int total = 0;
    for (T t : objects) {
      total += t.swim();
    }
    return total;
  }; 
}
