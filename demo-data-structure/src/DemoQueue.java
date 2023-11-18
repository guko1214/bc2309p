import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  
  public static void main(String[] args) {
    // if LinkedList has 100 methods
    // if Queue (Interface) has 60 methods
    // if List (Interface) has 40 methods
    //Queue<String> strings = Queue<String>;
    Queue<String> strings = new LinkedList<>();
    strings.add("ABC");
    strings.add("IJK");
    strings.add("DEF");
    System.out.println(strings);
    //System.out.println(strings.poll());
    String pollString = strings.poll();
    System.out.println(pollString);
    System.out.println(strings);
    System.out.println(strings.isEmpty()); // false
    System.out.println(strings.size()); // 3
    // while (!strings.isEmpty()) {
    //   strings.poll();
    // }
    System.out.println(strings.size()); // 3

    
    // exercise 
    int counter = 3; // IJKIJIJK, DEFDEFDEF
    String addString;
    String polled = "";
    System.out.println("peek=" + strings.peek());
    System.out.println(strings);
    String head = strings.peek(); // IJK

    int size = strings.size();
    int queueCount = 0;
    while (!strings.isEmpty()) {
      polled = strings.poll();
      //queueCount++;
      strings.add(polled.concat(polled));
      //strings.add(polled.concat(polled).concat(polled));
      //addString = polled.concat(polled).concat(polled);      
      //System.out.println(addString);
     // strings.add(addString);
      //if (++queueCount >= size * 2)
      if (++queueCount >= counter)
        break;
      //System.out.println(polled);  
      System.out.println(queueCount);
      System.out.println(strings);    
    }
    System.out.println("Final" + strings);

    strings.addAll(List.of("XYZ", "MNO"));
    System.out.println(strings);

    System.out.println(strings.contains("MNO")); //true

    for (String s: strings) {
      System.out.println(s);
    }
    // Use Queue when require remove the first and the second become the first
    strings.remove(); 
    System.out.println(strings);
    strings.remove("XYZ");
    System.out.println(strings);
    

    List<String> strs = List.of("A", "B");
    //strs.add("C");
    System.out.println(strs);
    // Compile-time, obj-ref strings can only call 60 methods in Queue
    // error: strings.indexOf() -> this is method from LinkedList, but not Queue Interface

    // exercise: use Queue in Lee-code or do Queue lee code
    // exercise: find out what's the difference between List and Queue in usage
    // new exercis in github
    List<String> strings2 = new LinkedList<>();
    
    


  }

}
