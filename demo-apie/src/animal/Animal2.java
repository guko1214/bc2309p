package animal;

public abstract class Animal2 {
  
  private double weight;

  private double height;

  public Animal2() {

  }

  public Animal2(double weight, double height) {
    this.weight = weight;
    this.height = height;
  }

  // 2. abstract class can be with abstract method or normal method
  // but class does not have asbract method.
  public abstract void sound();

  public void sound2() {
    System.out.println("zzz.....");
  }

  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  public static void main(String[] args) {
    // Difference between class and abstract class
   Animal animal = new Animal(13.0d, 20.3d,"white", "female"); 
   // 1. abstract class cannot be call with new
   // Animal2 animal2 = new Animal2();



  }
}
