import javax.management.RuntimeErrorException;

public class DemoUnCheckedException {
  
  public static void main(String[] args) {

    // unchecked exception should not use try catch 
    // should rewrite to avoid the unchecked exception

    // Unchecked Exceptions:
    // 1. ArithmeticException
    // 2. NullPointerException

    // Checked Exception:
    sum(2, -1);

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

}
