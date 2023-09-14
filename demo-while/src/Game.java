import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {

    // range 1 - 100
    // bomb: 74 (random number)
    // User guess a number between 1 - 100
    // 70
    // User guess a number between 71 - 100
    // 80
    // User guess a number betwee 71 - 79
    // ...
    // 74 -> bomb

    // which type of loop
    // bomb (randome)
    // how to ask user question?
    // compare user input vs bomb
    // revise the range for user to pick again
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1; 
    //System.out.println(bomb);
    //int user 
    Scanner input = new Scanner(System.in);
    //System.out.println("select a number between " + min + " and " + max + ": ");
    int usernumber = 0;
    do {
      // how to ask question
//      Scanner input = new Scanner(System.in);
      System.out.println("select a number between " + min + " and " + max + ": ");
      usernumber = input.nextInt();
      //Validation
      if (usernumber < min || usernumber > max) {
        System.out.println("Wrong number, Please input again.");
        continue;
      }
      // revise the range for user to pick again
      if (usernumber < bomb) {
        min = usernumber + 1;
      } else if (usernumber > bomb) {
        max = usernumber - 1;
      }
    } while (usernumber != bomb); // compare user input vs bomb

    System.out.println("Congrats, you got the bomb!!!");
    
    input.close();

    


  }
}
