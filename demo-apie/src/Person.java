public class Person { // Parent Class
  
  private String name;

  private int age;

  public int s;

  public static String x = "hello";

  public static int getY() {
    return 10;
  }

  public static boolean isElderly(int age) {
    return age >= 65;
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

  public boolean isElderly() {
    return this.age >= 65;
  }

  public boolean isAdult() {
    return this.age >= 18;
    //return (this.age >= 18? true : false);
    // boolean isAdult = false;
    // if (this.age >= 18)
    //   isAdult = true;
    // return isAdult;
  }

  public boolean isNameValid() {
    return this.name.length() <= 10;
  }

  @Override // Overriding the toString() method in Object.class
  public String toString() {
    return "name=" + this.name  //
        + ", age=" + this.age;
  }

  public static void main(String[] args) {
    Person person= new Person("John", 18);
    System.out.println(person.isAdult()); // true
    Person person2 = new Person("Mary",17);
    System.out.println(person2.isAdult()); // false

    // Approach 1
    if (person.getAge() >= 18) { // business domain
      System.out.println("This is adult, go to adult process");
    }
    // the parameter should not written in main, better in instance method

    // Approach 2
    // encapsulation, 
    if (person.isAdult()) { // business domain
      System.out.println("This is adult, go to adult process");
    }

    Person person3 = new Person("abcdefghijk", 65);
    System.out.println(person3.isNameValid()); // false
    System.out.println(person3.isElderly()); // true

    // don't use static method with "this" 's parameter
    // use static method across different class
    System.out.println(isElderly(person3.getAge()));


  }


}
