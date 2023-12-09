package javafuncinterface;

import java.util.function.BiPredicate;
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

  }
}
