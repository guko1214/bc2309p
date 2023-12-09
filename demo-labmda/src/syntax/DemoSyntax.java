package syntax;

import java.util.Random;

public class DemoSyntax {
  
  public static void main(String[] args) {
    SupplyInteger randomOddNumber = () -> {
      int times = new Random().nextInt(10);
      return 1 + times * 2;
    };

    System.out.println(randomOddNumber.supply());

    SupplyString howAreYou;
    int x = 10;
    if (x >= 10) {
      howAreYou = () -> {
        return "hello";
      };
    } else {
      howAreYou = () -> "goodbye";
    }
    System.out.println(howAreYou.supply());

    CharFunction cf = (s,i) -> {
      return s.charAt(i); // auto-box: char -> Character
    };

    System.out.println(cf.charFunction("Hello", 1)); // e
    System.out.println(cf.charFunction("abcdef",0)); // a
//    System.out.println(cf.charFunction("abcdef",10)); // runtime


    String[] source = new String[] {"abc", "def", "ijk"};
    // ConcatFunction concat = (arr) -> {
    //   StringBuilder sb = new StringBuilder();
    //   sb.append("de");
    //   for (String s : arr) {
    //     sb.append(s);
    //     //sb = sb.append(s);
    //   }
    //   return sb.toString();
    // };
    ConcatFunction formula;
    if (source.length < 10) {
      formula = (arr) -> {
        String r = "";
        for (String s : arr) {
          r = r.concat(s);
        }
        return r;
      };
    } else {
      formula = (arr) -> {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
          sb.append(s);
        }
        return sb.toString();
      };
    }

    //String[] string1 = new String[] {"abc", "def", "ijk"};
    System.out.println(formula.concat(source));

  }

}
