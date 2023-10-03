import java.math.BigDecimal;

public class Circle {
  
  // area
  // radius * radius * pi (3.14)
  // Math.PI
  double radius;

  String colour;

  public Circle() {

  }

  public Circle(double radius, String colour) {
    this.radius = radius;
    this.colour = colour;
  }

  public void setradius(double radius) {
    this.radius = radius;
  }

  public void setcolour(String colour) {
    this.colour = colour;
  }

  public double getradius() {
    return this.radius;
  }

  public String getcolour() {
    return this.colour;
  }

  public double area() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public double area2() {
    return this.radius * this.radius * Math.PI;
  }

  public double circumference() {
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(2)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public double circumference2() {
    return 2 * this.radius * Math.PI;
  }

  public static void main(String[] args) {

    Circle c1 = new Circle();
    c1.setradius(5.0);
    c1.setcolour("red");
    System.out.println(c1.getradius());
    System.out.println(c1.getcolour());
    System.out.println(c1.area2());
    System.out.println(c1.area());
    System.out.println(c1.circumference());
    
    Circle c2 = new Circle(5.0, "red");
    System.out.println(c2.getradius());
    System.out.println(c2.getcolour());    
    System.out.println(c2.area2());
    System.out.println(c2.area());
    System.out.println(c2.circumference());

    Circle c3 = new Circle(1.0, "yellow");
    System.out.println(c3.getradius());
    System.out.println(c3.getcolour());
    System.out.println(c3.area2());
    System.out.println(c3.area());
    System.out.println(Math.PI);
    System.out.println(c3.circumference());
    c3.setradius(8.9);
    System.out.println(c3.area2());
    System.out.println(c3.area());

  }

}
