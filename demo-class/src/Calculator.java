public class Calculator {
  
  int x;

  int y;

  int z;

  public int bmi() {
    // Calculator c = new Calculator;
    // c.setX(100);
    // c.setY(90);
    // c.setZ(35);
    // call c.bmi() -> bmi
    return this.x + this.y + this.z;
  }

  public int subtract() { 
    // Calculator c = new Calculator; 
    // c.setX(100)
    // c.setY(90)
    // call.c.subtract() -> 10
    // Calculator c2 = new Calculator;
    // c2.setX(12);
    // c2.setY(10);
    // call c2.subtract() -> 2
    return this.x - this.y;
  }

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

  // For static method, usually we have parameter(s)
  public static int subtract(int x, int y) { // Calculator.subtract(10, 3); 
    return x - y;
  }

  public static void main(String[] args) {
    int x = 100;
    int y = 300;
    System.out.println(Calculator.add(x,y)); // 12
    Calculator cal1 = new Calculator();
    System.out.println(cal1.add());
    cal1.setX(x);
    cal1.setY(y);
    // instance method
    System.out.println("Add=" + cal1.add()); // 12
    System.out.println("Subtract=" + cal1.subtract());
    // static method
    System.out.println("Add=" + Calculator.add(x, y));
    System.out.println("Subtract=" + Calculator.subtract(x, y));
    System.out.println("The grade of cal1 is " + cal1.grade());

    Calculator cal2 = new Calculator();
    cal2.setX(173);
    cal2.setY(95);
    System.out.println(cal2.add());
    System.out.println("The grade of cal2 is " + cal2.grade());

    Calculator cal3 = new Calculator();
    cal3.setX(10);
    // cal3.x = 10 // get the same result as using set method above, but not recommond, forget it!!!!!!!!!

  }

}
