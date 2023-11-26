public class App {
  public static void main(String[] args) {

    // Primitives - byte, short, int, long, float, double, char, boolean
    // Stirng 
    // Wrapper Class - Byte, Short, Interger, Long, Float, Double, Character, Boolean
    // 
    // float no relation with Double

    // Conversion between primitives and Wrapper Class
    short s1 = 10; 
    int i1 = s1; // upcast
    Integer i11 = i1; // auto-box
    int i2 = i11; // un-box
    
    // error, cannot assign short variable to Integer directly
    // Integer i12 = s1; 
    Integer i12 = (int) s1; // short (case) -> int (auto-box) -> Integer

    boolean b1 = true;
    Boolean b11 = b1; // auto-box
    boolean b2 = b11; // un-box
    
    char c1 = 'u';
    Character c11 = c1; // auto-box

    Float f11 = 9.3f; // auto-box, 9.3f is a float value (declare and assign by default), then auto-box to Float
    Integer i13 = 100; // auto-box, 100 is a int value, then auto-box to Integer
    Long l11 = 5L; // auto-box, 5L is a long value, then auto-box to Long

    // Wrapper Class has null value (default value)
    // Primitives has default value, int -> 0, double -> 0.0, boolean -> false, char -> '\u0000'
    Integer i15 = 4; // become null pointer (no address)
    System.out.println(i15);
    i15  = null;
    System.out.println(i15);

    String s = "Hello"; // auto-box, "Hello" is a String (declare and assign by default)
    s = null;

    Integer i16 = 8; // new Integer(8); 
    Integer i17 = new Integer(8); // not recommond way to auto-box since java 9
    System.out.println(i16==i17);// when compare between wrappers and variables should use methods, e.g. .equals
    // when compare between strings use methods (e.g. .equals) not comparator e.g. ==
    System.out.println(i16.equals(i17)); // true 
    System.out.println(i16==8); // comparing Integer and int, Integer i16 will be un-boxed
    System.out.println(i16 > 7); // true 
    System.out.println(i16.compareTo(8)); // 0
    System.out.println(i16.compareTo(9)); // -1, less than 9
    System.out.println(i16.compareTo(7)); // 1, larger than 7


  }
}