public class Car {
  
  String make;
  String model;
  String year;

  // Empty Constructor of Car
  // After "new Car()", the 3 instance variables do exist inside the object
  public Car() {
    
  }

  // Constructor Signature cannot be duplicated
 // public Car() {
  public Car(String make, String model, String year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public String getYear() {
    return this.year;
  }

  public static void main(String[] args) {
    Car c1 = new Car(); // object is created in heap
    c1 = new Car(); // a new object is created in heap, the old object will be deleted in heap.
    // In c1, the memory address is changed.

    // c1 is object reference (with memory address) -> found the object location
    // use the method inside the object to set value, the "abc" is assigned into 
    c1.setMake("abc");
    c1.setModel("xyz");
    c1.setYear("2020");

    Car c2 = new Car();
    System.out.println(c2.getMake());

    Car c3 = new Car("edf", "ijk", "2023");
    System.out.println("c3 make=" + c3.getMake());
    System.out.println("c3 moedl=" + c3.getModel());
    System.out.println("c3 year=" + c3.getYear());

    Car c4 = new Car("ryt", "doe");
    System.out.println("c4 make=" + c4.getMake());
    System.out.println("c4 moedl=" + c4.getModel());
    System.out.println("c4 year=" + c4.getYear());


    String str = "hello"; // str is an object reference in stack
    // "hello" is a String object in heap

    
  }

}
