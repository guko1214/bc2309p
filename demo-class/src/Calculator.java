public class Calculator {
  
  int x;

  int y;

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }


  public int add() {
    return this.x + this.y;
  }

  public char grade() {
    if (this.x > 150) {
      return 'A';
    }
    return 'F';
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int x = 100;
    int y = 300;
    System.out.println(Calculator.add(x,y)); // 12
    Calculator cal1 = new Calculator();
    System.out.println(cal1.add());
    cal1.setX(x);
    cal1.setY(y);
    System.out.println(cal1.add()); // 12
    System.out.println("The grade of cal1 is " + cal1.grade());

    Calculator cal2 = new Calculator();
    cal2.setX(173);
    cal2.setY(95);
    System.out.println(cal2.add());
    System.out.println("The grade of cal2 is " + cal2.grade());

  }

}
