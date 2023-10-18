public class Person { // Parent Class
  
  private String name;

  private int age;

  public int s;

  public static String x = "hello";

  public static int getY() {
    return 10;
  }

  // All-args constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {

  }

  public void setName (String name) {
    this.name = name;
  }

  public void setAge (int age) {
    this.age = age;
  }
 
  public String getName () {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  @Override // Overriding the toString() method in Object.class
  public String toString() {
    return "name=" + this.name  //
        + ", age=" + this.age;
  }


}
