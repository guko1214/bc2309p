public class StringConcat {
  
  public static void main(String[] args) {
    
    

    // Approach 1 (with return)
    // If ther are more than 1 line of code, we use code block
    // then we should hav "return"
    Concat concat1 = (a, b) -> {
      String result = a + b;
      return result;
    };

    // Approach 2 (with return)
    // One line of code
    Concat concat2 = (a, b) -> "hello";//(a + b);
    //Concat concat2 = (a, b) -> return "hello";//(a + b);

    // Execution
    System.out.println(concat1.concat("hello","world")); // helloworld
    System.out.println(concat2.concat("","ds"));

  }

}
