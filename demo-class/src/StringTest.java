public class StringTest {
  public static void main(String[] args) {
    // Approach 1
    String str = "hello"; // str is an object reference in stack
    // "hello" is a String object in heap

    String str2 = new String("hello"); // new keyword -> create an object in heap

    String str3 = str;

    // String Literal pool
    // logic find two string variable with the same value of "hello"
    // if so assign to the same object
    String str4 = "hello";

    String str5 = "hello!";

    System.out.println(str.equals(str2)); //true, comparing the value inside the object
    System.out.println(str == str2); //false, checking if they are the same object 
    System.out.println(str3 == str);//true, checking if the are the same object

    System.out.println(str == str4); // true???!!!
    System.err.println(str == str5); // false

  }
}
