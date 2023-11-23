import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {
  
  public static void main(String[] args) {
    // Queue<Integer> pq = new PriorityQueue<>(); // default: natural order sorting
    Queue<Integer> pq = new PriorityQueue<>(new SortByIntegerDesc()); // custom sorting: sortByIntegerDesc() i.e. sort in descending order
    pq.add(40);
    pq.add(20);
    pq.add(15);
    pq.add(150);// PriorityQueue sorting every time when object is added, the sorting is natural order in default 
    System.out.println(pq);  // not in the true order when print the priorityQueue toString
    while (!pq.isEmpty()) { 
      System.out.println(pq.poll());
    }

    Queue<String> pq2 = new PriorityQueue<>();
    // Queue<String> pq2 = new PriorityQueue<>(new SortByStringDesc());
    pq2.add("bcd");
    pq2.add("apple");
    pq2.add("banana");
    
    System.out.println(pq2); // not in the true order when print the priorityQueue toString
    while (!pq2.isEmpty()) {
      System.out.println(pq2.poll());
      // String polled = pq2.poll();
      // System.out.println(polled);
      // System.out.println(Objects.hash(polled));
    }

    // Exercise, use class other than wrapper class
    // e.g. person sort by age, older first, when same age, sort by name
    Queue<Student> pq3 = new PriorityQueue<>(new SortByStudentCustomSort());
    pq3.add(new Student(8, "John"));
    pq3.add(new Student(5, "Sam"));
    pq3.add(new Student(83, "Mary"));
    pq3.add(new Student(83, "Alan"));
    while (!pq3.isEmpty()) {
      System.out.println(pq3.poll());
    }
  }

}
