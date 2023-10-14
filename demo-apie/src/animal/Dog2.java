package animal;

public class Dog2 extends Mammal {

  private String name;

  public Dog2() {
    
  }

  public Dog2(String name, double weight, double height) {
    super(weight,height);
    this.name = name;
  }
  
  // 3.class has to implement all abstract methods
  @Override
  public void sound() {
    System.out.println("barking....");
  }

  public static void main(String[] args) {
    
    Dog2 dog2 = new Dog2();
    System.out.println(dog2.getHeight());
    dog2.sound();
    dog2.sound2();

    SmallDog smalldog = new SmallDog();
    smalldog.sound();
    smalldog.sound2();
  }


}
