package Shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  
  abstract double area();

  // if no extends Shapae, compile error
  // To ensure method defined can be called, 
  // i.e. the method is belong to the object(s) (in the parameter(s))
  public static <T extends Shape> double totalArea(List<T> shapes) { 
    BigDecimal totalArea = BigDecimal.valueOf(0d);
    for (T shape : shapes) {
      totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
    }
    return totalArea.doubleValue();
  }

  // public static <Shape> double totalArea2(List<Shape> shapes) { 
  //   BigDecimal totalArea = BigDecimal.valueOf(0d);
  //   for (Shape shape : shapes) {
  //     if (shape instanceof Circle)
  //       Circle s = (Circle) shape;
  //     totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
  //   }
  //   return totalArea.doubleValue();
  // }

  public static void main(String[] args) {
    
    List<Shape> shapes = new ArrayList<>();
    Circle circle1 = new Circle(3.45);
    Square square1 = new Square(9.49);
    Circle circle2 = new Circle(14.68);


    double totalArea = totalArea(List.of(new Circle(3.45), new Square(9.49), new Circle(14.68)));
    System.out.println(totalArea);
    System.out.println(List.of(new Circle(1.0), new Square(2.0)));


    Shape[] shapes2 = new Shape[] {new Circle(1.0), new Square(2.0)};
    System.out.println(shapes2[0].area());
    

  }

}
