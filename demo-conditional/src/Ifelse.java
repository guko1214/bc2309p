public class Ifelse {
  public static void main(String[] args) {
    // int
    int x = 100;
    if (x > 50) {
      System.out.println("x > 50");
    }
    x = 40;
    if (x < 40) {
      System.out.println("x < 40"); 
    } else {
      System.out.println("x >= 40");
    }
    x = 80;
    if (x != 80) { // come here first -> false
      System.out.println("x is not equals to 80");
    } else if (x < 80) { // then come here -> false
      System.out.println("x is smaller than 80");
    } else if (x >= 80) { // finally check if x >= 80
      System.out.println("x is larger or equals to 80");
    }
    int y = 10;
    if (y == 9) {
      System.out.println("y=9");
    } else if (y < 9) {
      System.out.println("y < 9");
    } else {
      System.out.println("y > 9");
    }

    int a = 10;
    int b = 3;
    if (a < 9 || b > 2) { // false || true -> true
      System.out.println("a < 9 or b > 2");
    }

    if (a < 9 && b > 2) { // false & true -> false
      System.out.println("a < 9 and b > 2");
    }

    // boolean
    boolean isMale = false;
    if (isMale) { // means, if (isMale == true)
      System.out.println("I am Male");
    } else {
      System.out.println("I am Female"); // print
    }

    // char
    char grade = 'A';
    if (grade == 'B') {
      System.out.println("it is B");
    } else if (grade == 'C' || grade == 'A') {
      System.out.println("it is C or A"); // print
    } else {
      System.out.println("bye");
    }
    // 4

    // * check if number is an even number
    int num =10;
    if (num % 2 == 0) {
      System.out.println("it is an even number. num=" + num);
    }

    //check if number is odd number
    if (num % 2 == 1) {
      System.out.println("it is an odd number. num=" + num);
    }

    
  }
}
