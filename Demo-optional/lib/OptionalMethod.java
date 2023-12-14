import java.util.Optional;

public class OptionalMethod {
  
  public static String[] database = new String[] {"xyz", "abc", "ijk"};

  public static void main(String[] args) {
    
    // System.out.println(OptionalMethod.fromDatabase("abc"));
    // System.out.println(OptionalMethod.fromDatabase("eds"));

    //Optional<Integer> result = OptionalMethod.fromDatabase("abc");
    Optional<Integer> result = OptionalMethod.fromDatabase("mmm");

    if (result.isPresent()) {
      System.out.println(result.get()); // 1
    } else {
      //System.out.println(result.get());
      System.out.println("Not found.");
    }
  }

  public static Optional<Integer> fromDatabase(String s) {
    for (int i = 0; i < database.length; i++) {
      if (s.equals(database[i])) {
        return Optional.of(i);
      } 
    }
    return Optional.empty();
  }

  // why is "null" is dangenous? runtime error? null pointer?
}
