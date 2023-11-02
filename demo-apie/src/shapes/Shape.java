package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import enums.Color;

public abstract class Shape {

  private Color color;

  //public static Shape[] shapes = new Shape[10]; // run in complie time

  public static Shape[] shapes;

  static {
    shapes = new Shape[10]; // run in runtime
  }

  public static void add(Shape shape) { // Since polymorphism, the class extends Shape can put in Shape Array
    for (int i = 0; i < shapes.length; i++) {
      if (shapes[i] == null) {
        shapes[i] = shape;
        //break;
        return;
      }
     }
  }

  public Shape() {

  }

  public Shape(Color color) {
    this.color = color;
  }

  abstract double area(RoundingMode mode, int dp);

  public Color getColor() {
    return this.color;
  }

  public static double totalArea(Shape[] shapes, RoundingMode mode, int dp) {
    BigDecimal totalArea = BigDecimal.valueOf(0);
    for (Shape shape : shapes) {
      if (shape != null) {
        //totalArea.add(BigDecimal.valueOf(shape.area(mode, dp))); // it not work, totalArea will remain zero.
        totalArea = totalArea.add(BigDecimal.valueOf(shape.area(mode, dp))); // BigDecimal return new object after calculation, rounding,....(i.e. any operation)        
      }
    }
    return totalArea.doubleValue(); // 178.53
  }

  public static void main(String[] args) {
    // new 2 Circles and 1 Square, and put them into the Shpae[]
    Circle circle1 = new Circle(3d, Color.BLACK);
    Circle circle2 = new Circle(4d, Color.BLUE);
    Square square1 = new Square(10d, Color.WHITE);

    // Shape.shapes[0] = circle1;
    // Shape.shapes[1] = circle2;
    // Shape.shapes[2] = square1;

    add(circle1);
    add(circle2);
    add(square1);

    System.out.println(shapes.getClass());
    System.out.println(shapes.length);

    System.out.println(shapes[0]);

    System.out.println(Shape.totalArea(shapes, RoundingMode.HALF_UP, 2));
    

   }

}
