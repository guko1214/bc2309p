package animal;

public class SmallDog extends Dog2 {
  
  @Override
  public void sound() {
    System.out.println("small sound.......");
  }

  public void sound2() {
    System.out.println("ZZZZZZZ..");
  }

  public static void main(String[] args) {

    Dog2 dog2 = new Dog2();
    dog2.sound();

    SmallDog smalldog = new SmallDog();
    // the sound method altered, since it is overrided in smalldog class
    smalldog.sound();

  }
}
