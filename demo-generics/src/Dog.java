import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dog extends Animal implements Comparable<Animal> {
  
  private int age;

  public Dog() {
    // super()
  }

  public Dog(String name, int age) {
    super(name);
    this.age = age;

  }

  @Override
  public String toString() {
    return "Dog(age=)" + this.age + ", name=" + super.getName() + ")";
  }

  public static <T extends Animal> void makeSound(Printer<T> animals) {

  }

  @Override 
  public int compareTo(Animal animal) {
    return animal.getName().compareTo(super.getName());
  }

  // public static void makeSound(Printer<Animal> animals) {
  //   System.out.println("animals");
  // }

  // public static void makeSound(Printer<Dog> animals) {
  //   System.out.println("dog");
  // }

  public static void main(String[] args) {
    Printer<Animal> animalPrinter = new Printer<>();
    Printer<Dog> dogPrinter = new Printer<>();

    // Printer<Animal> printer2 = new Printer<Dog>();
    // animalPrinter = dogPrinter; // cannot be polymorhism
    Printer<String> stringPrinter = new Printer<>();
    Printer<Dog> dogPrinter2  =new Printer<>();
    Dog.makeSound(dogPrinter2); // OK
    Dog.makeSound(animalPrinter); // OK
    // public static <T extends Animal> void makeSound restrict the T must be child class of Animal or Animal itself
    // The T in StringPrinter is String which is not child class of Animal or Animal, so compile error
    // makeSound(stringPrinter); // not OK, complie error

    List<Dog> dogs = new ArrayList<>(List.of(new Dog("CBA",20), new Dog("ABC",10),new Dog("CBA",20)));

    
    Collections.sort(dogs);

    System.out.println(dogs);

  }

}
