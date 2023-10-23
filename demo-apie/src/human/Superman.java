package human;

public class Superman extends Human implements Superpower, Life {
  
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
    System.out.println("I can run");
  }

}
