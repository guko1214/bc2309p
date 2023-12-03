import javax.management.RuntimeErrorException;

public class DemoUnCheckedException {
  
  public static void main(String[] args) throws Exception {

    // unchecked exception should not use try catch 
    // should rewrite to avoid the unchecked exception

    // Unchecked Exceptions:
    // 1. ArithmeticException
    // 2. NullPointerException

    // Checked Exception:
    //System.out.println(sum(-2, -1));

    int result2;
    try {
      result2 = sum(2, 4);
    } catch (Exception e) {
      result2 = -1;
    }
    

    String s;
    try {
      s = null;
      System.out.println(s.length()); // 0
    } catch(NullPointerException e) {
      s = "";
    }

    int result;
    int x = 0;
    if (x == 0) {
      result = 1;
    } else {
      result = 10 / x;
    }

    try {
      result = 10 / 0;
      System.out.println(result);
    } catch(ArithmeticException e) {
      result = 1;
    }
      
    // Example 1:
    System.out.println(divide(9,3));
    System.out.println(divide(9,0));
    
    try {
      // Since divided3 would throw a check exception ,
      // so the method caller has to handle the method call by try catch
      result = divide3(9,3);
    } catch (BusineseException e) {
      result = -1;
    }

    // Example 2
    System.out.println(arrayIndexOutOfBound(new int[10]));

  }

  public static int sum(int x1, int x2) throws Exception {
    if (x1 < 0 || x2 < 0) 
      throw new RuntimeException();
    if (x1 >= 0 && x2 >= 0) 
      return x1 + x2;
   
    //return -1;
    throw new Exception(); // force try catch implementation
                           // let user of the method to determine
                          // what to do when exception occurs
                          // whereter than the method determine
  }
 
  public static int divide(int x, int y) {
    int result = x / y;
    return result;
  }

  public static int divide2(int x, int y) {
    int result;
    try {
      result = x /y;
    } catch (ArithmeticException e) { // Not a must to catch ArithmeticException
     result = 0; 
    }
    return  result;
  }


  // The method signature need to add "throws exception" if the logic throw checked exception
  public static int divide3(int x, int y) throws BusineseException {
    int result;
    try {
      result  = x / y;
    } catch (ArithmeticException e) { // Convert uncheck exception to checked exception
      throw new BusineseException();
    }
    return result;
  }

  public static void arrayIndexOutoutofBound(int[] arr) {
    arr[arr.length] = 1; // error
    // You should fix the progran dirdectly
    // instead of using try catcah to handle such senirios
  }

}
