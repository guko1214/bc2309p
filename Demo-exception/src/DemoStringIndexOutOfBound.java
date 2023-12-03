public class DemoStringIndexOutOfBound {
  
  public static void main(String[] args) {
    System.out.println(charAt("hello")); 
    //java.lang.DemoStringIndexOutOfBound
  }

  public static char charAt(String s) {
    
    try {
       return s.charAt(s.length());
    } catch (NumberFormatException e) {
      return s.charAt(s.length()-1);
    }

  }


}
