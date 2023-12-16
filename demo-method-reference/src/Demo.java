import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import com.azul.tooling.ConsumerManager.Consumer;

public class Demo {
 
  private static List<String> strings = new ArrayList<>(List.of("IJK", "ABC", "XYZ"));

  public static void main(String[] args) {
    
    // Method Reference -> Lambda expression
    strings.forEach(System.out::println);
    System.out.println("=======================");
    strings.forEach(e -> System.out.println(e));

    // Consumer Lambda Expression i -> s.charAt(i) 
    // Method Reference
    String s = "dw";
    //Consumer<Integer> index = s::charAt;
    
    Function<Integer, Character> charAtFunction = i -> "hello".charAt(i);
    Function<Integer, Character> charAtFunction2 = "hello"::charAt;
    System.out.println(charAtFunction.apply(2));


    // Compar
    Comparator<String> comparaTo = (s1, s2) -> s1.compareToIgnoreCase(s2);
    Comparator<String> comparaTo2 = String::compareToIgnoreCase;

    System.out.println(strings);
    Collections.sort(strings, comparaTo2);
    System.out.println(strings);


    // ClassName::new
    Function<String, Integer> newInteger = s -> new Integer(s);
    Function<String, Integer> newInteger2 = Integer::new;
    // ClassName::valueOf
    Function<String, Integer> integerValueOf = s2 -> Integer.valueOf(s2);
    Function<String, Integer> integerValueOf2 = Integer::valueOf;
    
  }

}
