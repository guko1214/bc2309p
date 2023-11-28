

public class Dog extends Animal {
  
  private int age;

  public static <T extends Animal> void makeSound(Printer<T> animals) {

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
  }

}
