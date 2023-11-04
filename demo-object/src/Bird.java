import java.util.Objects;

public class Bird { // implicitly extend Object.class

  public String name;

  private int age;

  private final String color = "yellow";

  public static Bird valueOf(String name) {
    return new Bird(name);
  }

  public Bird(String name) { // new Bird("John")
    this.name = name;
  }

  public Bird() {

  }

  // public void setColor(String color) {
  //   this.color = color;
  // }
  
  public void setName(String name) {
    this.name = name;
    //this.color = color;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public boolean equals(Object obj) { // b2.equals(b3) -> true
    if (this == obj)
      return true;
    if (!(obj instanceof Bird))
      return false;
    Bird bird = (Bird) obj;
    //return bird.getName().equals(this.name); // Check String by equals(), "John"
    return Objects.equals(bird.getName(), this.name)
        && Objects.equals(bird.getAge(), this.age);
  } 

  @Override
  public int hashCode() {
    //return Objects.hash(this.name, this.age);
    //return Objects.hash(this.age);
    return Objects.hash(this.name);
  }


  @Override
  public String toString() {
    return "Bird(name=" + this.name + ", color=" + this.color + ", Object(toString=" + super.toString() 
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
      // downcast from Object.class to Bird.class
      Bird b = (Bird) object;
      //object = (Bird) object;
      //object.fly();
      b.fly();
      System.out.println(object.getClass());
      System.out.println(b.getClass());
    } else if (object instanceof String) {
      String s = (String) object;
      System.out.println(s.length());
    } else if (object instanceof Integer) {
      Integer i = (Integer) object;
      System.out.println(i.intValue());
    } else if (object instanceof Double) {
      Double d = (Double) object;
      System.out.println(d.doubleValue());
    }

    object = new int[5][1];

    Bird bird2 = new Bird("bird2");
    System.out.println(bird2.toString());
    System.out.println(bird2.getColor());
    // int rt = 2147483647;
    // System.out.println(rt);
    // rt = (short) rt;
    // System.out.println(rt2);

    Integer i1 = Integer.valueOf("100"); // 100
    Integer i2 = new Integer("100"); // 100

    Bird b1 = new Bird("John");
    Bird b2 = Bird.valueOf("John");
    System.out.println(b2.toString());

    String s2 = String.valueOf("se");
    System.out.println(s2.charAt(0));

    System.out.println(b1.equals(b2));
    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());

    b1.setAge(20);
    //b2.setName("Mary");
    b2.setAge(10);
    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());

    Object[] allCanBeArray = new Object[4];
    allCanBeArray[0] = "123";
    System.out.println(allCanBeArray[0].getClass()); // class java.lang.String
    allCanBeArray[1] = 123;
    System.out.println(allCanBeArray[1].getClass()); // class java.lang.Integer
    allCanBeArray[2] = 0.0;
    System.out.println(allCanBeArray[2].getClass()); // class java.lang.Double
    allCanBeArray[3] = new Bird();
    System.out.println(allCanBeArray[3].getClass()); // class Bird

    Object[] allCanBeArray2 = new Object[4][3];

    
  }
}
