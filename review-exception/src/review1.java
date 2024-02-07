import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.management.RuntimeErrorException;

public class review1 {


  // public int something(String filepath) {
  //   Scanner scanner = new Scanner(new File(filepath));
  // }
  //public int getSomeInterger(String filepath) throws FileNotFoundException {
    public int getSomeInterger(String filepath) {  
    
    try {
      Scanner scanner = new Scanner(new File(filepath));
      return Integer.parseInt(scanner.nextLine());
    } catch (FileNotFoundException e) {
      throw new RuntimeException("File not found",e);
    }
  }
  
}
