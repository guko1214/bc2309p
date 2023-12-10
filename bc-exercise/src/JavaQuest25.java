/*
 * Question : Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 * 
*/
public class JavaQuest25 {
  public static void main(String[] args) {
    System.out.println(countWords("       ")); // 0
    System.out.println(countWords("")); // 0
    System.out.println(countWords("Hello")); // 1
    System.out.println(countWords("Hello, my name is John."));// 5
    System.out.println(countWords(" . "));// 1
    System.out.println(countWords("  .dw  ds  "));// 2

  }

  public static int countWords(String s) {
    // code here
    char[] charSeq = s.toCharArray();
    if (charSeq.length == 0)
      return 0;
    char preCha = charSeq[0];    
    int noSeg = 0;
    boolean stopCount = false;
    for (int i = 0; i < charSeq.length; i++) {
      if (charSeq[i] != ' ' & stopCount == false) {
        noSeg++;
        stopCount = true;
      }
      if (stopCount == true && charSeq[i] == ' ') {
        stopCount = false;
      }
      preCha = charSeq[i];
    }
    // System.out.println("============================");
    // char[] charSeq = s.toCharArray();
    // if (charSeq.length == 0)
    //   return 0;
    // char preCha = charSeq[0];    
    // int noSeg = 0;
    // boolean isSpa = preCha == ' ';
    // if (isSpa == true) {
    //   noSeg = 0;
    // } else {
    //   noSeg = 1;
    // }
    // for (int i = 1; i < charSeq.length; i++) {
    //   if (charSeq[i] != ' ' && isSpa == true) {
    //     isSpa = false;
    //     noSeg = 1;
    //   }        
    //   if (preCha != ' ' && charSeq[i] == ' ' && i != charSeq.length - 1) {
    //     System.out.println("i=" + i);
    //     System.out.println("precha=" + preCha);
    //     System.out.println("cha=" + charSeq[i]);
    //     noSeg++;
    //     System.out.println("noSeg=" + noSeg);
    //   }
    //   preCha = charSeq[i];
    // }    
    return noSeg;     
  }
}