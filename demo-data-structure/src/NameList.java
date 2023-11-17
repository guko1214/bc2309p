// Design a Class (Node), link up another Node object 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NameList {
  
  private String id;

  private NameList next; // object reference

  public NameList() {

  }

  public NameList(String id) {
    this.id = id;
  }

  // public void add(Node next) {

  // }

  public NameList getNext() {
    return this.next;
  }

  public NameList getMiddle() {
    // To DO
    // Step 1. count total num of elements / 2
    // Step 2. loop until hte half count
    int count = 0;
    NameList head = this;
    while (head.getNext() != null) {
      head = head.getNext();
      ++count;
    }
    return null;
  }

  public NameList getLast() {
    NameList head = this;
    while (head.getNext() != null) {
      head = head.getNext();
    }
    return head;
  }

  public int size() {
    int count = 1;
    NameList head = this;
    while (head.getNext() != null) {
      head = head.getNext();
      count++;
    }
    return count;
  }

  public void add(NameList next) {  
  // public void setNext(Node next) {
    // NameList head = this.next;
    // while (head.getNext() != null) {
    //   head = head.getNext();
    // }
    if (this.next == null) {
      this.id = next.id;
    } else {
      this.getLast().next = next;
    }
    
    //System.out.println(this.getLast());
  }

  public void add(String id) {  
    if (this.id == null) {
      this.id = id;
    } else {
      this.getLast().next = new NameList(id);
    }
    
  }

  public String remove(String id) {
    // return removed element
    // if not found, return null
    NameList oldHead = this;
    NameList head = this;
    if (this.id == null & this.getNext() == null)
      return null;
    if (this.id.equals(id)) {
      if (this.getNext() != null) {
      this.id = this.getNext().id;
      this.next = head.getNext().next;
      } else {
        this.id = null;
      }
      return id;
    }
    // while (head.getNext() != null && !(head.id.equals(id))) {
    //   oldHead = head;
    //   head = head.getNext();
    // }
    // if (head.id == id) {
    //   oldHead.next = head.next;
    //   return id;
    // }
    do {
      if (head.id == id) {
        oldHead.next = head.next;
        return id;
      }
      oldHead = head;
      head = head.getNext();
    } while ((head != null));// && !(head.id.equals(id))))
    return null;    
  }
    
  public String getId() {
    return this.id;
  }

  @Override
  public String toString(){
    StringBuilder namelist = new StringBuilder();
    NameList head = this;
    for (int i = 0; i < this.size(); i++) {
      namelist = namelist.append(this.id + " -> ");
      head = head.getNext();
    }
    return namelist.toString();
  }

  public static void main(String[] args) {
    NameList node1 = new NameList("John"); // node1 -> node2
    System.out.println("node1 ref=" + node1);
    NameList node2 = new NameList("Mary");
    System.out.println("node2 ref=" + node2);

    // node1.setNext(node2);
    node1.add(node2);

    NameList node3 = new NameList("Peter");
    System.out.println("node3 ref=" + node3);
    
    node2.add(node3);

    // node1 -> node2 -> node3
    NameList head = node1;
    while (head.getNext() != null) { // if head.getNext() == null, exit
      head = head.getNext();
    }
    System.out.println("List tail=" + head);
    System.out.println("List tail's id=" + head.getId());

    System.out.println("node1 ref=" + node1);
    System.out.println("node2 ref=" + node2);
    System.out.println("node3 ref=" + node3);

    node1.add("Derrick");
    head = node1;
    while (head.getNext() != null) { // if head.getNext() == null, exit
      head = head.getNext();
    }
    System.out.println("List tail=" + head);
    System.out.println("List tail's id=" + head.getId());

    NameList nl = new NameList();
    nl.add("ABC");
    nl.add("DEF");
    nl.add("XYZ");
    //System.out.println(nl.getId());
    LinkedList<String> nl2 = new LinkedList<>();
    nl2.add("ABC");
    nl2.add("DEF");
    nl2.add("XYZ");

    // nl.add("detdee");
    // nl.add("dwewt");

    NameList head2 = nl;
    while (head2.getNext() != null) {
      head2 = head2.getNext();
      System.out.println(head2.getId());
    }
    System.out.println("=============================");
    //System.out.println(nl.getNext().getId());
    // nl.remove("ABC");
    nl.remove("DEF");
    nl.remove("XYZ");
    nl.remove("dwewt");
    
    System.out.println("=======");
    head2 = nl;
    // System.out.println(head2.getId());
    // while (head2.getNext() != null) {
    //   head2 = head2.getNext();
    //   System.out.println(head2.getId());
    // }
    System.out.println(nl.toString());
      
    // Compare to LinkedList
    LinkedList<String> nl3 = new LinkedList<>();

    nl3.add("ABC");
    nl3.add("DEF");
    nl3.add("XYZ");
    System.out.println("size=" + nl3.size()); // 3
    nl3.get(nl3.size() - 1); // no array in nl3, searching require loop through the 

    ArrayList<String> nl4 = new ArrayList<>();
    nl4.add("ABC");
    nl4.add("DEF");
    nl4.add("XYZ");
    System.out.println("size=" + nl4.size()); // 3
    nl4.get(nl3.size() - 1); // arr[arr.length-1] // is array, seraching not require loop

    List<String> nl5 = new ArrayList<>();
    nl5 = new LinkedList<>();
    // Compile time in Java: List<String> determine which methods can be invoked
    // Run time in Java: nl5 will know which object it points to. ArrayList or LinkedList object?
    nl5.add("ABC");
    nl5.remove(0);

    System.out.println(nl5.size()); // 0

  }
  

}
