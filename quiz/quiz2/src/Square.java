package quiz.quiz2.src;

import java.math.BigDecimal;

public class Square {
  private BigDecimal length;

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public static void main(String[] args) {
    Square s = new Square();
    s.setLength(5);


    StringBuilder s2 = new StringBuilder("abc");
    boolean bool = s2.append("def").startsWith("def");
  }

}
