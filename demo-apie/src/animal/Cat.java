package animal;

public class Cat extends Animal {

  private String lengthOfHair;

  private String colorOfEye;

  public Cat(double height, double weight, String color, String sex, 
    String lengthOfHair, String colorOfEye) {
      
      super(height, weight, color, sex);
      this.lengthOfHair = lengthOfHair;
      this.colorOfEye = colorOfEye;
  }

  public String sound() {
    return "Meow";
  }

  public String toString() {
    return "Car(hair=" + this.lengthOfHair  + ", color of eye=" + this.colorOfEye
            + ", Animal(" + super.toString() +"))";
  }

  public static void main(String[] args) {
    
    Cat cat = new Cat(26.5, 24.5, "black", "male", "short", "yellow");
    System.out.println(cat.toString());

  }

}
