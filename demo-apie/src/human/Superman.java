package human;

public class Superman extends Human implements Superpower, Life {
  
  private String name;

  public Superman(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }


  @Override
  public void fly() {
    System.out.println("I am Superman, and flying...");
  }

  @Override
  public void eat() {
    System.out.println("I need eat");
  }
  
  @Override
  public void drink() {
    System.out.println("I need drink");
  }

  @Override
  public void sleep() {
    System.out.println("I need sleep");
  }

  @Override
  public void run() {
    System.out.println("I am running....");
  }

  public static void main(String[] args) {
    // Polymorphism
    Superman s = new Superman("Tommy");
    // s is an object reference
    // this object reference is point to an Superman Object.
    
    // Use Human to declare Superman object
    Human h = new Superman("Mary");
    // h.getName(); No getName from h, as h is object reference declared by Human
    h.run(); // I am running ... (during runtime, the object performs behaviour)
    // why use Human to declare Superman object?

    
  }

}
