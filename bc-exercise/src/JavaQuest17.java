/*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5.
 * Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 :
 * Input : num = 3535
 * Output : 3333
 * 
 * Example 2 :
 * Input: num = 5555
 * Output: 3355
*/
public class JavaQuest17 {

  public static void main(String[] args) {
    System.out.println(minimum35Number(3355)); // Output : 3333
    System.out.println(minimum35Number(5353));// Output : 3333
    System.out.println(minimum35Number(3535));// Output : 3333
    System.out.println(minimum35Number(5555));// Output : 3355
    System.out.println(minimum35Number(3333));// Output : 3333
    System.out.println(minimum35Number(3353));// Output : 3333
    System.out.println(minimum35Number(5535));// Output : 3335

  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {
    //System.out.println("o" + num);
    StringBuilder stringNum = new StringBuilder(String.valueOf(num));    
    Integer min = Integer.valueOf(num);
    int changeDigit = 0;
    while (changeDigit < stringNum.length()) {        
        //System.out.println("===========");
        stringNum = new StringBuilder(String.valueOf(num));
        if (stringNum.charAt(changeDigit) == '3') {
            stringNum.setCharAt(changeDigit,'5');
        } else if (stringNum.charAt(changeDigit) == '5') {
            stringNum.setCharAt(changeDigit,'3');
        }        
        //if (Integer.valueOf(stringNum.toString()).compareTo(num) == -1) {        
        //min = Integer.valueOf(stringNum.toString());
        //}
        min = Math.min(min,Integer.valueOf(stringNum.toString()));
        StringBuilder stringNum2;
        for (int i = changeDigit + 1; i < stringNum.length(); i++) {
            stringNum2 = new StringBuilder(stringNum);
            //System.out.println(stringNum2);
            if (stringNum2.charAt(i) == '3') {
                stringNum2.setCharAt(i,'5');
            } else if (stringNum2.charAt(i) == '5') {
                stringNum2.setCharAt(i,'3');
            }
            // if (Integer.valueOf(stringNum.toString()).compareTo(num) == -1) {
            //    min = Integer.valueOf(stringNum.toString());
            // }
            //System.out.println(stringNum2);
            min = Math.min(min,Integer.valueOf(stringNum2.toString()));
        }
        //System.out.println("======================");
        changeDigit++;    
    }

    return min;
  }
}