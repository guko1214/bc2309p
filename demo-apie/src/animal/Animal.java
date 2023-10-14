package animal;

public class Animal {
  
  private double weight;

  private double height;

  private String color;

  private String sex;

  public Animal() {

  }

  public Animal(double weight, double height,String color, String sex) {
    this.weight = weight;
    this.height = height;
    this.color = color;
    this.sex = sex;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  public String getSex() {
    return this.sex;
  }

  public double getWeightPowHeight() {
    return this.weight * this.height;
  }

  public String toString() { // the parent should provide the toString() method
    return "weight=" + this.weight // the toString() should written in parent class                                   
        + ", height=" + this.height
        + ", color=" + this.color
        + ", sex=" + this.sex; // even the child class has it own toString()
  }



}
