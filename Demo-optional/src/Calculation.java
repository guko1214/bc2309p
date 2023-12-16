import java.util.Optional;
import javax.swing.text.html.Option;

// Never use Optional<T> as input parameter for methods
public class Calculation {
  
  public static void main(String[] args) {
    Integer i1 = null;
    Integer i2 = 2;
    //Integer reuslt = add(Optional.ofNullable(i1), Optional.ofNullable(i2));  // null + 2 -> 2
    System.out.println(add(Optional.ofNullable(i1), Optional.ofNullable(i2)));// null + 2 -> 2
    System.out.println(add(null, null)); // throw IAE
  }

  // Design NOT OK, 
  // you have to handle null scenario for both Optional Object 
  // and the object inside the Optional Object
  public static Integer add(Optional<Integer> x, Optional<Integer> y) {
   // return x + y;
    if (x == null || y == null)
      throw new IllegalArgumentException();
    int xValue = 0;
  //  x.ifPresent(e -> {
  //   xValue = e; // write operation 
  //  });
    if (x.isPresent()) {
      xValue = x.get();
    }
    int yValue = 0;
    if (y.isPresent()) {
      yValue = y.get();
    }
    return xValue + yValue;
  } 



}
