package javafuncinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
  
  public static void main(String[] args) {

    // Function<String, String> -> UnaryOperator<String>

    UnaryOperator<String> uo = s -> s + "hello";
    System.out.println(uo.apply("abc"));
    
    // BiFunction<String, String, String> -> BinaryOperator<String>
    BinaryOperator<String> bo = (s1, s2) -> s1 + s2;
    System.out.println(bo.apply("abc","def"));


  }


}
