import java.math.BigDecimal;

public class Triangle {

  // Once it is created, it's base & height cannot be revised

  double base;
  double height;

  // public Triangle { // do not set a empty constructor
  // }

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  } 

  // do not set a setter can prevent alter the object's attribute after declare and assign

  public double getbase() {
    return this.base;
  }

  public double getheight() {
    return this.height;
  }

  public double area() {
    return BigDecimal.valueOf(this.base)
        .multiply(BigDecimal.valueOf(this.height)) //
        .divide(BigDecimal.valueOf(2)) //
        .doubleValue();
  }

  public double area2() {
    return (this.base * this.height) / 2.0;
  }

  public double circumference() {
     return BigDecimal.valueOf(this.base).doubleValue();
   }

  public static void main(String[] args) {

    Triangle t1 = new Triangle(3.0, 5.0); // new object in heap
    System.out.println(t1.getbase());
    System.out.println(t1.getheight());
    System.out.println(t1.area2());
    System.out.println(t1.area());

    t1 = new Triangle(3.0, 5.0); // another object in heap, NOT alter the original one

  }

}
