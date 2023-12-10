/*Given a 0-indexed string s, repeatedly perform the following operation any number of times:

Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if any) and the closest occurrence of c to the right of i (if any).
Your task is to minimize the length of s by performing the above operation any number of times.

Return an integer denoting the length of the minimized string. */
public class JavaQuest31 {
  public static void main(String[] args) {
    System.out.println(minStringLength("null"));// output : 3
    System.out.println(minStringLength("aaa"));// output : 1
    System.out.println(minStringLength("abcabcabc"));// output : 3
    System.out.println(minStringLength("bbccdd"));// output : 3
    System.out.println(minStringLength("helloworldhelloworld"));// output : 7
    System.out.println(minStringLength("hellwordhoewlloolrld"));// output : 7
  }

  public static int minStringLength(String s) {
    // code here
    //int round = 0;
    boolean haveNewP = false;
    boolean haveNewS = false;
    StringBuilder sb = new StringBuilder(s);
    StringBuilder sbP = new StringBuilder();
    StringBuilder sbS = new StringBuilder();
    boolean noNew = true;
    do {
        haveNewS = false;
        haveNewS = false;
        noNew = true;
 //       System.out.println("round=" + round);
        for (int i = 0; i < sb.length(); i++) {
 //           System.out.println("i=" + i);
            for (int j = i - 1; j > -1; j--) {
                //System.out.println("i=" + i);
                //System.out.println("j=" + j);
 //               System.out.println("s i(" + i + ")=" + sb.substring(i, i+1));
 //               System.out.println("s j(" + j + ")=" + sb.substring(j, j+1));
                if (sb.substring(i,i+1).equals(sb.substring(j, j+1)) && haveNewP == false) {
                    haveNewP = true;
                } else {
                    sbP.insert(0,sb.substring(j, j+1));
                    //System.out.println("sbP=" + sbP);
                    // System.out.println("s i(" + i + ")=" + sb.substring(i, i+1));
                    // System.out.println("s j(" + j + ")=" + sb.substring(j, j+1));
                }
            }
//            System.out.println("sbP=" + sbP);
            sbS.append(sb.substring(i, i+1));
//            System.out.println("sbS pre=" + sbS);
            for (int j = i + 1; j < sb.length(); j++) {
     
                //System.out.println(sb.substring(i, i+1));
                ///System.out.println(sb.substring(j, j+1));
 //               System.out.println("s i(" + i + ")=" + sb.substring(i, i+1));
//                  System.out.println("s j(" + j + ")=" + sb.substring(j, j+1));               
                if (sb.substring(i,i+1).equals(sb.substring(j,j+1)) && haveNewS == false) {
                    haveNewS = true;
                    //System.out.println(sb.substring(j, j+1));
                } else {
                    sbS.append(sb.substring(j, j+1));
                    //System.out.println("sbS=" + sbS);
                    //System.out.println("s i(" + i + ")=" + sb.substring(i, i+1));
                    //System.out.println("s j(" + j + ")=" + sb.substring(j, j+1));
                }
            }
 //           System.out.println("sbS=" + sbS);
            // if (i < newSb.length()) {
            //     newSb = sbP.append(newSb.substring(i, i+1)).append(sbS);
            // } else {
            //     newSb = sbP.append(newSb.substring(i, i)).append(sbS);
            // }
            //newSb = sbP.append(sbS);
            sb = sbP.append(sbS);
            sbP = new StringBuilder();
            sbS = new StringBuilder();
 //           System.out.println("sb=" + sb);
            if (haveNewP == true || haveNewS == true) {
                noNew = false;
                break;
            }
        }
        //++round;
        // if (round > 20) {
        //     stop = true;
        // }
    } while (noNew == false);
    //System.out.println(sb);
    return sb.length();
  }
}
