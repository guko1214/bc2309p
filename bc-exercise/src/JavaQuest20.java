/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    //StringBuilder string = new StringBuilder(s)
    for (int i = 0; i < s.length(); i++) {
        //string = string.subSequence(1,string.length()-1).append(String.valueOf(string.charAt(0)));
        s = s.substring(1) + s.charAt(0);
    //    System.out.println(s);
        if (s.equals(goal))
            return true;
    }
    //System.out.println("=================");
    return false;
  }
}