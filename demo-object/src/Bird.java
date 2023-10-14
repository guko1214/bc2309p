public class Bird { // implicitly extend Object.class

  public String name;

  private final String color = "Yellow";

  // public void setColor(String color) {
  //   this.color = color;
  // }

  public String getColor() {
    return this.color;
  }

  @Override
  public String toString() {
    return "Bird(name=" + name + ", Object(toString=" + super.toString() 
    + ", class=" + super.getClass() + "))";
  }

  // Final method cannot be Override
  public final void fly() {
    System.out.println("this is final fly() method.");
  }

  public static void main(String[] args) {
    Bird bird = new Bird();
    System.out.println(bird.toString()); // Bird@372f7a8d -> Object Reference
    // if not @Override toString -> Bird@372f7a8d -> Object Reference
    System.out.println(bird.getColor());

    Object object = new Object();
    object = "123";
    System.out.println(object.getClass()); // class java.lang.String
    object = 123;
    System.out.println(object.getClass()); // class java.lang.Integer
    object = 0.0;
    System.out.println(object.getClass()); // class java.lang.Double
    object = new Bird();
    System.out.println(object.getClass()); // class Bird
    //object.fly()
    if (object instanceof Bird) { //
      // downcase
      Bird b = (Bird) object;
      //object = (Bird) object;
      //object.fly();
      b.fly();
      System.out.println(b.getClass());
    } else if (object instanceof String) {
      
    }

    // int rt = 2147483647;
    // System.out.println(rt);
    // rt = (short) rt;
    // System.out.println(rt2);

    Object[] allCanBeArray = new Object[4];
    allCanBeArray[0] = "123";
    System.out.println(allCanBeArray[0].getClass()); // class java.lang.String
    allCanBeArray[1] = 123;
    System.out.println(allCanBeArray[1].getClass()); // class java.lang.Integer
    allCanBeArray[2] = 0.0;
    System.out.println(allCanBeArray[2].getClass()); // class java.lang.Double
    allCanBeArray[3] = new Bird();
    System.out.println(allCanBeArray[3].getClass()); // class Bird





    
  }
}
