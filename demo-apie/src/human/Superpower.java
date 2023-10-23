package human;

public interface Superpower {
  
  public void fly();

  default void precognitate() {
    System.out.println("I can know what happen in the future....");
  };


}
