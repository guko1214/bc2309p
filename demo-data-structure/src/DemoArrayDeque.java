import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoArrayDeque {
 
  public static void main(String[] args) {
    Queue<String> arrayQueue = new ArrayDeque<>();
    //Queue<String> arrayQueue = new PriorityQueue<>();

    // add 1,000,000 strings into queue
    for (int i = 0; i < 1000000; i++) {
      arrayQueue.add("test");
    }

    // poll()
    long start = System.nanoTime();
    System.out.println(start);
    while (!(arrayQueue.isEmpty())) {
      arrayQueue.poll();
    }
    long end = System.nanoTime();
    System.out.println("(Queue) ArrayDeque poll Execution time=" + (end - start));

    Queue<String> linkedListQueue = new LinkedList<>();

    // add 1,000,000 strings into queue
    for (int i = 0; i < 1000000; i++) {
      linkedListQueue.add("test");
    }

    // poll()
    start = System.nanoTime();
    System.out.println(start);
    while (!(linkedListQueue.isEmpty())) {
      linkedListQueue.poll();
    }
    end = System.nanoTime();
    System.out.println("(Queue) LinkedList poll Execution time=" + (end - start));

    // Deque / Queue vs Object & Object reference

    Deque<String> deque = (Deque) arrayQueue; // potential runtime error, if the object is ArrayDeque, no error; while the object is PriorityQueue, runtime error
    // 1. No new object.
    // 2. Two object references (Deque & Queue) pointing to the same object (new ArrayDeque)
    // 3. During Run-time, JVM will check if the object fulfill the object reference's type

    System.out.println(arrayQueue instanceof Deque<?>);
    System.out.println(arrayQueue instanceof PriorityQueue<?>);
    // Typical Type-safty checking, that's why there is no type-safty complain anymore
    if (arrayQueue instanceof Deque<?>) {
    //if (arrayQueue instanceof Deque<String>) {      
      //Deque<String> deque = (Deque) arrayQueue;
      Deque<String> deque2 = (Deque<String>) arrayQueue;
    }    
    //complie time only know the left (object reference), no idea of the right (the object)

    Deque<Integer> dequeIntegers = new LinkedList<>();
    Queue<Integer> queueIntegers = dequeIntegers;
    // Because Deque (dequeIntegers) is a child of Queue, complier ensure queueIntegers can hold the object

    // Deque<String> deque = new ArrayDeque<>();


  }

}
