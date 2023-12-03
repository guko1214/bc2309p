package methods;

import java.util.Arrays;

public class ChainMethodCheckedException {
  
  public static void main(String[] args) {
    // main -> A -> B -> C
    // C throw checked exception
    // A & B do not handle it
    // main handle it by try catch

  //   String sa = "sdfg";
  //   System.out.println(sa.toCharArray());
  //   char[] arr = sa.toCharArray();
  //   System.out.println(Arrays.toString(arr));
  //   try {
  //     System.out.println(methodA("hello",3)); //java.lang.StringIndexOutOfBoundsException
  //   } catch (StringIndexOutOfBoundsException e) {
  //     System.out.println("StringIndexOutOfBounds exception");
  //   }
     
  // }

    try {
      System.out.println(methodA(20));
      System.out.println(methodA(20));
    } catch (Exception e) {
      System.out.println("Exception");
    }

  }
  //public static char methodA(String s, int x) throws Exception {
  public static int methodA(int x) throws Exception {  
    //return s.charAt(methodB(x));
    return methodB(x);
  }

  public static int methodB(int x)  throws Exception  {
    //return methodC(x) - 2;
    return methodC(x,4);
  }

  public static int methodC(int x, int y)  throws Exception  {
    //return x + 4;
    try {
      return x / y;
    } catch (ArithmeticException e) {
      throw new Exception();
    }
  }

}
