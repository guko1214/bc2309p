package quiz.quiz2.src;

public class Simple {

  public static void main(String[] args) {
    String s = "string";
    char[] s2 = s.toCharArray();
    String s3 = String.valueOf(s2);    
    System.out.println(s3);


    int purchasedAmount = 9;
    //int roundedAmount = purchasedAmount % 10;
    int roundedAmount = purchasedAmount;
    System.out.println(roundedAmount%10);
    System.out.println(roundedAmount/10);

    //System.out.println(100 - ((roundedAmount%10 + roundedAmount/10) * 10));
    //double roundedAmount2 = roundedAmount;
    //System.out.println(roundedAmount2);

  }

}
