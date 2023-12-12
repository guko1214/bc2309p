package javafuncinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {
    // Predicate is a boolean formula
    /// Function<Integer, Boolean> -> Predicate<Intefer>
    // static boolean method in runtime
    Predicate<Integer> isOdd = x -> x % 2 == 1;
    System.out.println(isOdd.test(9)); // true
    System.out.println(isOdd.test(8)); // false

    Predicate<Integer> isPositive = x -> x > 0;
    System.out.println(isPositive.test(-1));  // false
    System.out.println(isPositive.test(1)); // true

    // Combine two predicate<T> together
    System.out.println(isOdd.and(isPositive).test(9)); // true
    System.out.println(isOdd.and(isPositive).test(-7)); // false
    System.out.println(isOdd.and(isPositive).test(10)); // false
    
    System.out.println(isOdd.or(isPositive).test(10)); // true

    BiPredicate<Integer, Integer> isLargerThan = (x,y) -> x > y;
    System.out.println(isLargerThan.test(10,9)); // true
    System.out.println(isLargerThan.test(10,10)); // false
    System.out.println(isLargerThan.test(10,11)); // false


    // Approach 1
    int x = 100;
    boolean isOverSomething = x > 20;

    // Approach 3
    System.out.println(test(100));

    // Approach 2
    Predicate<Integer> isOverSomethingFormula = num -> num > 20;
    System.out.println(isOverSomethingFormula.test(100));
    System.out.println(isOverSomethingFormula.test(15));

    // Funciton
    BiFunction<Integer, Integer, String> convertFunction = (a, b) -> {
     return String.valueOf(a).concat(String.valueOf(b));
    };
    System.out.println(convertFunction.apply(1,10));

    
    Consumer<List<Student>> printAllStudents = students -> {
      for (Student s : students) {
        System.out.println("Student name=" + s.getName() + ", id=" + s.getId());
      }
    };

    printAllStudents.accept(new ArrayList<>(
        List.of(new Student(1,"John"), new Student(2,"Mary"))));

  }

  public static boolean test(int x) {
    return x > 20;
  }

  public static String convert(Integer x, Integer y) {
    return String.valueOf(x).concat(String.valueOf(y));
  }

}
