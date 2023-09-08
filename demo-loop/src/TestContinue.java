public class TestContinue {
  public static void main(String[] args) {
    // for loop ten times
    for (int i = 0; i < 10; ++i) {
      if (i >= 2) {
        continue;
      }
      System.out.println("i=" + i); // 0,1
    }
    
    // 2, 4, 6, 8, 10 -> continue
    for (int i = 1; i < 11; i++) {
      if (i % 2 != 0) { // if (i % 2 == 0)
        continue;
      }
      // skip the rest
      // code ...
      System.out.println("i=" + i);
    }

    String s = "abcd";
    // charAt, for loop.
    // a
    // b
    // c
    // d
    for (int i = 0; i < s.length(); i++) { // i < 4 ->;0, 1, 2, 3
      System.out.println("The char of s at pos " + i + " is " + s.charAt(i));
    }

    // What is the position of c? 2
    for (int i = 0; i < s.length(); i++) { // times of loop
      if (s.charAt(i) == 'c') {
        System.out.println("The position of char 'c' is " + i);
      }
    }

    // Find the char 'x', and print the next char of 'x'
    // if not found, print -1
    String s2 = "ijkzyx";
    //String s2 = "ijkxyz";
    boolean found = false;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'x'){
        found = true;
        System.out.println("The position of char 'x' is " + i);
        if (i + 1 > s2.length() - 1) { // for x is the last char, if i is out of index of s2 it cannot run
          System.out.println("Char 'x' is the last char");
        } else {
          System.out.println("-1");
          System.out.println("The next char of 'x' is " + s2.charAt(i + 1));
        }
      }
    }
    if (found == false) {
      System.out.println("-1");
    }

    //alternate of above
    boolean found2 = false;
    char target = ' ';
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'x') {
        if (i + 1 <= s2.length() - 1) {
        target = s2.charAt(i + 1); // assign 'y' to variable target
        }
        found2 = true;
        break;
      }
    }
    if (found2) { // found == true
      System.out.println("The next char of 'x' is " + target);
    } else {
      System.out.println(-1);
    }

  }
}
