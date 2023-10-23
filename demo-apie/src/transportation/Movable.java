package transportation;

public interface Movable { // 合約, Contract    // 條款、框架
  // before Java8, 100% abstraction

  // implicitly "public static finally"
  String name = "Car";

  // all method in interface are implicitly "public abstract" (by default)
  Movable move(); // method signature

  void accelerate();

  // after Java 8 - 2014
  // implicitly public (instance method)
  default void printWinner(String name) {
    System.out.println(name + " is Winner.");
  }

  // implicitly public (static method)
  static void staticPrintWinner(String name) {
    System.out.println(name + " is Winner.");
  }

}
