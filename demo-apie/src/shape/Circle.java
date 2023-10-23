package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape {
  
  private double radius;

  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Circle))
      return false;
    Circle circle = (Circle) obj;
    return Objects.equals(this.radius, circle.radius);
  }

  public int hashCode() {
    return Objects.hash(this.radius);
  }

  public String toString() {
    return "Circle(radius=" + this.radius + ", Shape())";
  }


  public double area(RoundingMode mode, int dp){
    BigDecimal r = BigDecimal.valueOf(this.radius);
    BigDecimal pi = BigDecimal.valueOf(Math.PI);
    BigDecimal area = pi.multiply(r).multiply(r);
    return area.setScale(dp,mode).doubleValue();

  }


  public static void main(String[] args) {

    Circle circle = new Circle(3.5);
    //System.out.println("area=" + circle.area());
    //System.out.println("area=" + (Math.round(circle.area()* 100)/100.0));
    //System.out.println("area=" + BigDecimal.valueOf(circle.area()).setScale(2,RoundingMode.HALF_UP).doubleValue());
    System.out.println("area=" + circle.area(RoundingMode.HALF_UP,2));
    System.out.println(circle.hashCode());
    System.out.println(circle.toString());
    
    Circle circle2 = new Circle(10.987);
    Circle circle3 = new Circle(3.5);

    System.out.println(circle2.hashCode());
    System.out.println(circle3.hashCode());
    System.out.println(circle.equals(circle2));
    System.out.println(circle.equals(circle3));

  }

}
