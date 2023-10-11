package animal;

public class Animal {
  
  private double weight;

  private double height;

  private double color;

  private String sex;

  public Animal() {

  }

  public Animal(double weight, double height, String sex) {
    this.weight = weight;
    this.height = height;
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
        + ", sex=" + this.sex; // even the child class has it own toString()
  }

}
