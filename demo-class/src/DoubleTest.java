import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {
  public static void main(String[] args) {
    double d1 = 0.1;
    double d2 = 0.2;
    System.out.println(d1 + d2); // Precision issue
    System.out.println(0.3 - 0.1);// Precision issue

    System.out.println(0.3f - 0.1f);// Precision issue

    BigDecimal bd = new BigDecimal("0.3"); // if use Double or Float to assign value will cause problem, better to use valueOf()
    System.out.println(bd);
    BigDecimal bd2 = new BigDecimal("0.1");
    System.out.println(bd2);
    BigDecimal result = bd.subtract(bd2);
    System.out.println(result);
    System.out.println(bd.subtract(bd2)); // 0.2

    BigDecimal bd3 = BigDecimal.valueOf(0.3); // better
    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal result2 = bd3.subtract(bd4);
    System.out.println(result2);

    BigDecimal result3 = bd.add(bd2);
    System.out.println(0.3 + 0.1); // Precision issue
    System.out.println(result3); // 0.4
    BigDecimal result4 = bd.multiply(bd2);
    System.out.println(0.3 * 0.1); // Precision issue
    System.out.println(result4); // 0.03
    BigDecimal result5 = bd.divide(bd2);
    System.out.println(0.3 / 0.1); // Precision issue
    System.out.println(result5); // 3

    System.out.println(bd.compareTo(bd2));
    System.out.println(bd.compareTo(bd));
    System.out.println(bd2.compareTo(bd));

    System.out.println(new BigDecimal("0.3").subtract(new BigDecimal("0.1")));
;
    // new or valueOf()
    BigDecimal bd5 = BigDecimal.valueOf(10.45678).setScale(2,RoundingMode.UP);
    System.out.println(bd5);

    BigDecimal bd6 = BigDecimal.valueOf(10.4519).setScale(2,RoundingMode.DOWN);
    System.out.println(bd6);

    BigDecimal bd7 = BigDecimal.valueOf(10.4519).setScale(2,RoundingMode.CEILING);
    System.out.println(bd7);

    BigDecimal bd8 = BigDecimal.valueOf(10.425).setScale(2,RoundingMode.HALF_UP);
    System.out.println(bd8);

    if (bd5.equals(bd7)) {
      System.out.println("bd5 is equal to bd7");
    } else {
      System.out.println("bd5 is NOT equal to bd7");
    }

        if (bd5.equals(bd6)) {
      System.out.println("bd5 is equal to bd6");
    } else {
      System.out.println("bd5 is NOT equal to bd6");
    }

  }
}