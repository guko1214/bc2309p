/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int first = 1;
    int second = 1;
    int temp = 0;
    for (int i = 0; i < 16; i++) {
      if (i == 0) {
        System.out.println(first);
      } else if (i == 1) {
        System.out.println(second);
      } else {
        System.out.println(first + second);
        temp = first;
        first = second;
        second = temp + second;
      }
    }
  }
}