public class Square {

  // Attribute
  float length;

  // Empty Constructor
  public Square() {

  }

  // Constructor 2
  // All-arguments constructor (arguments -> parameters)
  // constructor that include all parameters of the defined class
  public Square(float length) {
    this.length = length;
  }

  // setter
  public void setlength(float length) {
    this.length = length;
  }

  // get length method
  public float getlength() {
    return this.length;
  }

  // get area method
  public float area() {
    return this.length * this.length;
  }

  public static float area(float length) {
    return length * length;
  }

  public float perimeter() {
    return this.length * 4;
  }

  public void abc() {
    System.out.println("hello. this is abc method.");
  }

  // method signature cannot be duplicated
  // method signature = method name + parameters
  public static void abc(String s) {
    System.out.println("hello. this is abc method." + s);
  }
  
  public static String abc(String s, String s2) {
    return s + s2;
  }

  public static void main(String[] args) {

    Square sq = new Square(9);

    Square sq2 = new Square();
    sq2.setlength(3);

    System.out.println(sq.getlength());
    System.out.println(sq2.getlength());
    System.out.println(sq.area());
    System.out.println(sq2.area());
    System.out.println("Static method get area=" + Square.area(9));
    System.out.println(Square.area(3));
    System.out.println(sq.perimeter());
    System.out.println(sq2.perimeter());
    System.out.println(((float) sq.area()) / ((float) sq.perimeter()));
    System.out.println(((float) sq2.area()) / ((float) sq2.perimeter()));
    
    Square sq3 = new Square();
    for (float i = 1; i < 10; i += 0.1) {
      //System.out.println("i=" + i);
      sq3.setlength(i);
      System.out.println(((float) sq3.area()) / ((float) sq3.perimeter()));
    }

    // revise
    sq2.setlength(7);
    System.out.println(sq2.area());

    // difference between instance method and static method
    // instance method: new object first -> use the instance variables to calculate
    // static method: in and out (no object)

    sq2.abc(); // print 
    // String s = sq2.abc(); // print this is prohibit since the "abc" method do not return anthing
    Square.abc("");
    
  }

}
