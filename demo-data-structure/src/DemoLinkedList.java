import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  

  public static void main(String[] args) {
    // LinkedList<String> strings = new LinkedList<>();
    // strings.add("hello");
    // string.add("world");
    LinkedList<String> strings = new LinkedList<>();
    strings.add("hello");
    strings.add("world");
    //string1.add("hello");
    System.out.println(strings.contains("world")); // true
    
    List<String> strings2 = DemoLinkedList.getEmptyList(0); // return Object (ArrayList or LinkedList)
    strings2.add("hello");
    strings2.add("world");
    System.out.println(strings2.contains("world")); // true

    
  }


  public static List<String> getEmptyList(int value) { // return interface type
    if (value == 0)
      return new ArrayList<>();
    return new LinkedList<>();
  }
  
  

}
