import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {
  
  public static void main(String[] args) {

    Queue<String> queue = new LinkedList<>();
    queue.add("ABC");
    queue.add("IJK");

    Stack<String> stack = new Stack<>(); 
    System.out.println(stack.push("Hello")); // Hello
    stack.push("World");
    stack.push("!!!");
    System.out.println(stack.pop()); // !!!

    System.out.println(stack.add("Test")); // true
    System.out.println(stack.pop()); // Test
    
    stack.clear(); // clear all data in the stack

    String[] arr = {"123", "456", "789"};

    // loop -> insert data into stack
    // loop -> get the data from stack, place into another array
    for (String str : arr) {
      stack.push(str);
    }
    System.out.println(stack);
    System.out.println(stack.peek()); // 789
    System.out.println(stack);
    String[] result = new String[arr.length];
    int i = 0;
   while (!(stack.isEmpty())) {
      result[i++] = stack.pop();
    }
    System.out.println(Arrays.toString(result)); // [789, 456, 123]


  }

}
