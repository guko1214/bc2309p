import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayLinkedList {
  
  public static void main(String[] args) {

    
    //long start = System.currentTimeMillis();
    long start = System.nanoTime();
    System.out.println(start); //
    for (int i = 0; i < 10000000; i++) {
      
    }
    //long end = System.currentTimeMillis();
    long end = System.nanoTime();
    System.out.println("Execution time=" + (end - start));


    // ArrayList add 10,000,000
    start = System.nanoTime();
    // usually use the referenc type in the left, to restrict functions the objects can use
    // use List to declare ArrayList
    List<String> integers = new ArrayList<>(); 
    for (int i = 0; i < 10000000; i++) {
      //integers.add(i);
      integers.add(String.valueOf(i));
    }
    end = System.nanoTime();
    System.out.println("ArrayList add Execution time= " + (end - start));

    // LinkedList add 10,000,000
    start = System.nanoTime();
    List<String> integers2 = new LinkedList<>();
    for (int i = 0; i < 10000000; i++) {
      //integers2.add(i);
      integers2.add(String.valueOf(i));
    }
    end = System.nanoTime();
    System.out.println("LinkedList add Execution time=" + (end - start));

    // ArrayList remove 10,000,000
    start = System.nanoTime();
    //ArrayList<String> integers = new ArrayList<>();
    for (int i = 0; i < 10000000; i++) {
      integers.remove(i);
    }
    end = System.nanoTime();
    System.out.println("ArrayList remove Execution time= " + (end - start));

    // LinkedList remove 10,000,000
    start = System.nanoTime();
    //LinkedList<String> integers2 = new LinkedList<>();
    for (int i = 0; i < 10000000; i++) {
      integers2.remove(i);
    }
    end = System.nanoTime();
    System.out.println("LinkedList remove Execution time=" + (end - start));


  }

}
