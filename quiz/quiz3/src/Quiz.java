public class Quiz {

  public static void main(String[] args) {
    Database p1 = new Database(new String[] {"ABC","BCD", "XYZ"});
    Database p2 = p1;
    Database p3 = new Database(new String[] {"ABC","BCD", "XYZ"});
    String s1 = "ABC";
    String s2 = "ABC";

    System.out.println(p1 == p2);
    System.out.println(p2 == p3);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(p1.getStrings()[1]));
    System.out.println(s2.equals(s1));
  }

  
}
