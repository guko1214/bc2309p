package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import enums.Color;

public class Circle extends Shape {
  
  private double radius; 

  public Circle() {

  }

  public Circle(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  // // getter, setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Circle))
      return false;
    Circle circle = (Circle) obj;
    // return Objects.equals(this.radius, circle.radius);
    return Objects.equals(this.radius, circle.radius) ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius);
  }

  @Override
  public String toString() {
    return "Circle(radius=" + this.radius + ", Shape(color=" + super.getColor() + "))";
  }


  public double area(RoundingMode mode, int dp){
    BigDecimal r = BigDecimal.valueOf(this.radius);
    BigDecimal pi = BigDecimal.valueOf(Math.PI);
    BigDecimal area = pi.multiply(r).multiply(r);
    return area.setScale(dp,mode).doubleValue();
  }

  public double getDiameter() { // encapsulation of the method that calculate diameter
    return this.radius * 2;
  }


  public static void main(String[] args) {

    Circle circle = new Circle(3.5, Color.BLACK);
    //System.out.println("area=" + circle.area());
    //System.out.println("area=" + (Math.round(circle.area()* 100)/100.0));
    //System.out.println("area=" + BigDecimal.valueOf(circle.area()).setScale(2,RoundingMode.HALF_UP).doubleValue());
    System.out.println("area=" + circle.area(RoundingMode.HALF_UP,2));
    System.out.println(circle.hashCode());
    System.out.println(circle.toString());
    
    Circle circle2 = new Circle(10.987, Color.WHITE);
    Circle circle3 = new Circle(3.5, Color.BLACK);

    System.out.println(circle2.hashCode());
    System.out.println(circle3.hashCode());
    System.out.println(circle.equals(circle2));
    System.out.println(circle.equals(circle3));
    System.out.println(circle3.getClass());

    Shape shape = new Circle(4, Color.WHITE);
    System.out.println(shape.toString());
    System.out.println(shape.getClass());
    System.out.println(shape instanceof Shape);
    System.out.println(shape instanceof Circle);
    System.out.println(shape.area(RoundingMode.HALF_UP,2)); // 4 * 4 * 3.14159


  }

}
