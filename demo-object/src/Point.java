import java.util.Objects;

public class Point {
  
  private int x;

  private int y;

  // public Point() {

  // }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point valueOf(int x, int y) {
    return new Point(x, y);
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Point))
      return false;
    Point point = (Point) obj;
    return Objects.equals(this.x, point.getX())
        && Objects.equals(this.y, point.getY());
  }

  @Override
  public String toString() {
    return "Point(x=" + this.x + ", y=" + this.y + ")";
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }

  // moveRight
  //public Void right() {
  public Point right() {
    // this.setX(this.getX() + 1);
    //++this.x;
    this.x += 1;
    return this;
  }

  //public void left() {
  public Point left() {
    --this.x;
    return this;
  }

  public Point up() {
    ++this.y;
    return this;
  }

  public Point down() {
    //--this.y;
    this.y -= 1;
    return this;
  }

  // // Exercise
  public Point rightAndup() {
    ++this.x;
    ++this.y;
    return this;
  }
  


  public static void main(String[] args) {
    Point point = new Point(0, 0);
    Point point2 = new Point(0, 1);
    Point point3 = new Point(0, 1);

    System.out.println(point.equals(point2));
    System.out.println(point2.equals(point3));
    
    // point.right();
    // point.up();
    // point.left();
    // point.up();
    System.out.println(point.toString());
    System.out.println(point2.toString());
    System.out.println(point.equals(point2));

    point.right().up().left().up();
    System.out.println(point); // 0,2

    point.right(); // Java doesn't require to receive the return object form method
    point.up();
    System.out.println(point); // 1,3

    //point.getX();
    //Point reuslt = Point.rightAndUp(point); // 2,4
    Point.rightAndUp(point); // 2,4
    //System.out.println(result);
    System.out.println(point); 


    String s = "hello";
    // Point.concatA(s);
    s = Point.concatA(s);
    System.out.println(s);

  }

  // Custome class pass by reference
  public static void rightAndUp(Point point) { // Pass by reference
    point.setX(point.getX() + 1);
    point.setY(point.getY() + 1);
    //return point;
  }

  // public static void concatA(String str) { // pass by value
  //   str = str + "A";
  // }
  
  // All primitive and All wrappers pass by value
  public static String concatA(String str) { // pass by value
    str = str + "A";
    return str;
  }

  

}
