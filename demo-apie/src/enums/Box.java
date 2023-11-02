package enums;

import java.time.LocalDate;
import java.util.Random;

public class Box {
 
  private Color color; // 

  // private String color2; // "WHITE", "WITE", "WHITE ", "WWWW"

  public Box(Color color) {
    this.color = color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public char getColorCode() { // instance method
    return this.color.getCode();
  }

  public static final int SIZE = 100;

  public static void main(String[] args) {

    Box box = new Box(Color.BLUE); // Color is not a class, it is a enum,
    
    // Primitive & enum should be always compared by using "=="
    // Wrapper class & custom class should always be compared by "equals()"
    if (box.getColor() == Color.BLUE){
      System.out.println("this box color is Blue");
    }

    box.setColor(Color.BLACK);
    if (box.getColor() == Color.BLACK) {
      System.out.println("this box color is Black");
    }

    System.out.println("Box Color's code=" + box.getColor().getCode()); // B
    System.out.println("Box Color's code=" + box.getColorCode()); // B

    System.out.println(Color.BLUE.name());
    System.out.println(Color.BLUE.name().toLowerCase());

    for (Color color: Color.values()) { // Color[]
      System.out.println(color.name() + "'s code=" + color.getCode() + ", description=" + color.getDescription());
    }
    // valueOf(), from string to enum
    System.out.println(Color.valueOf("WHITE")); // from string to enum

    System.out.println(Color.findEnumByCode('W').equals(Color.valueOf("WHITE")));
    System.out.println(Color.getMessage(Color.BLACK));

    System.out.println(Box.SIZE);



    
    

  }

  

}
