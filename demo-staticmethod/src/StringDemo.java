public class StringDemo {


  // Key points:
  // Method Signature: method name + (optional) parameter(s)
  // Method Signature can be duplicated in a class
  // Method Return Type (Class or primitive or Array ....)
  // With Method Code Block: you should always return a value of all scenario
  // The type of return value should match the return type of the method
  // void -> make sure understand why we need "void"in method return type


  public static void printString(String str) {
    if (str.length() > 3) {
      return;
    }
    System.out.println("str = " + str);
    // return; // (optional) not must present if return type is void, but is can still present
  }


  public static String print(String str) {
    //System.out.println(str);
//    for (int i = 0; i < str.length(); i++) {
//      System.out.println(str.charAt(i));
//    }
    //Stirng s = str.charAt(0);
    //s = s + str.charAt(s.charAt(str.length()-1));
    return str + " World";
  }

  public static int print2(String str) {
  //  char[] characters = str.toCharArray();
    //for 
    return str.length();
  }

  public static int print3(String str) {
    char[] characters = str.toCharArray();
    int value = 0;
    int charvalue;
    for (char c : characters){
      charvalue = c; // upcase
      //System.out.println(charvalue);
      value += c;
    }

    return value;
  }


  public static String print(String str1, String str2) {
    if (!str1.equals(str2)) {
      return str1 + str2;
    }
      //} else if (str1.length() > str2.length()) { 
      //return str1;
     //}
     // split the else if to another if would better for modify later
     if (str1.length() > str2.length()) {
      return str1;
    }
    // else {
    // return str2
    //}
    // better to put else to let alone return clause
    return str2;
  }


  public static void main(String[] args) {
    String str = "Hello";
    System.out.println(print(str));

    System.out.println(StringDemo.print2(str));

    System.out.println(StringDemo.print3(str));

    String str1 = "Hello";
    String str2 = "Would";
    System.out.println(print(str1, str2));

    String str3 = "abc";
    StringDemo.printString(str3);
  }

}
