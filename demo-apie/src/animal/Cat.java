package animal;

public class Cat extends Animal {

  private String name;

  public String sound() {
    return "Meow";
  }

  public String toString() {
    return "Car(name=" +this.name + ", Animal(" + super.toString() +"))";
  }

  public static void main(String[] args) {
    
  }

}
