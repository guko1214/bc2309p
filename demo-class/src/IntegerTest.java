public class IntegerTest {
  public static void main(String[] args) {
    Integer i1 = 127; // auto-box
    System.out.println(i1.equals(127)); // true, if you want compare the value
    System.out.println(i1 == 127); // true

    Integer i2 = 128;
    System.out.println(i2 == 128); // true

    Integer i3 = 127;
    System.out.println(i1 == i3); // true

    Integer i4 = 128;
    System.out.println(i2 == i4); // false??? !!!

    // Internal Cach (Byte, Short, Integer, Long), -128 to 127

    String str1 = "hello";
    System.out.println(str1 == "hello"); // true
    
  }
}