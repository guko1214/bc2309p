import java.util.Arrays;

public class Teststring2 {


  public static String[] split1(String str) {
    String[] strs = new String[str.length()];
    String temp = "";
    int j = -1;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {

        strs[++j] = temp;
        temp = "";
        System.out.println(temp);        
      }
        temp += str.charAt(i);
    }
    strs[++j] = temp;
    return strs;
  }

  public static String[] split2(String str) {
    String[] strs = new String[str.length()];
    int j = 0;
    int k = 0;
    String str2;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' || i == str.length() - 1) {
        str2 = "";
        for (int l = k; l <= i; l++) {
           str2 += str.charAt(l);
        }
        strs[j] = str2.trim();
        k = i + 1;
        j += 1;
      }
    }
    return strs;
  }


  public static void main(String[] args) {
    String str = "Hello world"; // [hello], [world]
    str += " Hello world";

    System.out.println(Arrays.toString(split1(str)));
    System.out.println(Arrays.toString(split2(str)));

    //System.out.println(Arrays.toString(strs));

    // split()
    String[] results = str.split(" ");

    // replace()
    System.out.println(str.replace(" ","_"));


    //System.out.println(strs[0]);
    //System.out.println(strs[1]);
    System.out.println(Arrays.toString(results));
    System.out.println(compute("hello","abc"));


  }

  public static String compute(String str1, String str2) {
    // if length of str1 > str2, return str1 + str2, else str2
   if (str1.length() > str2.length()) {
    //return str1 + str2;
    return str1.concat(str2);
   }
    return str2;
  }

}
