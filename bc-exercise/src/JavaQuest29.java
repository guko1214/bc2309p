/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// 1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here
    String s1 = String.valueOf(n);
    StringBuilder s2 = new StringBuilder("");
    int lastIdx = s2.length();
    for (int i = s1.length() - 1; i > -1; i = i - 3) {
        //System.out.println("char at " + i + " " + s1.charAt(i));
        lastIdx = i - 2;
        if (i > -1)
            s2.insert(0,s1.charAt(i));
        if (i - 1 > -1)            
            s2.insert(0,s1.charAt(i - 1));
        if (i - 2 > -1) {         
            s2.insert(0,s1.charAt(i - 2));
            if (i - 2 > 0)
                s2.insert(0,",");
        }
    }
    for (int i = lastIdx - 1; i > -1; i--) {
        s2.insert(0,s1.charAt(i));
    }
    return s2.insert(0,"$").toString();
  }

}