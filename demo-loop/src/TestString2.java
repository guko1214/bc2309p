public class TestString2 {

  public static void main(String[] args) {
    String str1 = "abcd";
    String str2 = "xcyz";
    // print true/ false
    // Question: check if two String has a common character
    boolean common = false;
    char commonchar = ' ';
    outerLoop: for (int i = 0; i < str1.length(); i++) {
      for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(i) == str2.charAt(j)) {
          common = true;
          commonchar = str1.charAt(i);
          break outerLoop;
          }
        }
      }
    
    if (common) {
      System.out.println(
          "There is common character between str1 and str2, and the common character is " + commonchar);
    } 

  }
}
