package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import enums.Color;

public class Circle extends Shape {
  
  private double radius;

  public Circle() {

  }

  // Encapsulation of Constructor
  public static Circle of(double radius, Color color) { // Overloading
    return new Circle(radius, color);
  }

  public static Circle of(double radius) { // Overloading
    return new Circle(radius, Color.BLACK);
  }

  public static Circle of(Color color) { // Overloading
    return new Circle(1.0, color);
  }

  public static Circle ofBlue(double radius) {
    return new Circle(radius, Color.BLUE);
  }

  private Circle(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  // // getter, setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setColor(Color color) {
    super.setColor(color);
    //this.radius = radius + 1;
    this.radius = 
        BigDecimal.valueOf(this.radius).add(BigDecimal.ONE).doubleValue();
  }

  //public double getRadius() {
  public BigDecimal getRadius() { // user cannot know what datatype of radius, even the getRadius return the radius in BigDecimal
                                  // the return type of getter not necessarily be the same of the store date type of the variable of the class
                                  // but ofter the getter should be written to return the datetype of the variable stored for convenient
    //return this.radius;
    return BigDecimal.valueOf(this.radius);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Circle))
      return false;
    Circle circle = (Circle) obj;
    // return Objects.equals(this.radius, circle.radius);
    return Objects.equals(this.radius, circle.radius);
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

    //Circle circle = new Circle(3.5, Color.BLACK); // cannot call when the constructor is private
    Circle circle = Circle.of(3.5, Color.BLACK); 
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
    System.out.println(shape.area(RoundingMode.HALF_UP,2)); // 4 * 4 * 3.14159 // only known the formula when runtime

    Circle circle4 = Circle.ofBlue(5);
    Circle circle5 = Circle.of(Color.WHITE);
    Circle circle6 = Circle.of(3.9);
    Circle circle7 = Circle.of(3.9, Color.BLACK);

    System.out.println("circle5's radius=" + circle5.getRadius());
    circle5.setColor(Color.BLACK);
    System.out.println("circle5's radius=" + circle5.getRadius());

    System.out.println(circle.getRadius().floatValue());

    // valueOf() -> static method
    String str = String.valueOf(1); // "1"
    String str2 = String.valueOf('1'); // "1"
    String str3 = String.valueOf(true); // "true"

  }

}
