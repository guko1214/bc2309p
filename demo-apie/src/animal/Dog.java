package animal;

public class Dog extends Animal {
  
  private String name;

  public Dog() {

  }

  public Dog(double weight, double height,String sex, String name) {
    super(weight, height, sex); // super() must be the first in constructor
    this.name = name;
    
  }

  public String sound() {
    return "WO WO";
  }

  public double getWeight2() {
    return super.getWeight();
  }

  public String toString() {
    //return "weight=" + super.getWeight() + ", height=" + super.getHeight()
    //+ ", name=" + this.name;
    // this is usual way to describe when a class is inherited from a parent class
    return "Dog(name=" + this.name + ", Animal(" + super.toString() + "))"; 
  }

  public static void main(String[] args) {
    
    Dog dog = new Dog();
    Dog dog2 = new Dog(12.0d, 13.0d,"Male","MoMo");

    System.out.println(dog.getWeight());
    System.out.println(dog.getHeight());

    System.out.println(dog2.getWeight());
    System.out.println(dog2.getHeight());

    System.out.println(dog.toString());
    System.out.println(dog2.toString());
    System.out.println(dog);
    
  }

}
