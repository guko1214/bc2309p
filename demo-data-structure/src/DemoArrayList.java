import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
  
  public static void main(String[] args) {
    // array - kind of data structure
    String[] strings = new String[5]; // fixed size
    for (int i = 0; i < strings.length; i++) {
      strings[i] = "hello";
    }
    // strings[5] = "hello"; //  java.lang.ArrayIndexOutOfBoundsException

    // ArrayList.class,
    // ArrayList<String> string2 = new ArrayList<String>(); // no require to write <String> since later java version
    ArrayList<String> string2 = new ArrayList<>(); // Variable size
    string2.add("hello"); // array is removed, and new another array
    string2.add("hello");
    string2.add("hello");
    string2.add("hello");
    string2.add("hello");
    // for-each
    for (String s : string2) {
      System.out.println(s);
    }
    //string2.add("hello");
    
    // ArrayList -> 1 - 10, print out the elements
    // Store the numbers which can be divided by 3
    // Integer i = Integer.valueOf(1);
    int i = 0;
    ArrayList<Integer> integers  = new ArrayList<>();
    while (++i <= 10) {
      //integers.add(Integer.valueOf(i));
      //integers.add(i); // autobox 
      if (i % 3 == 0) {
        integers.add(i);
      }
    }
    for (Integer integer : integers) {
      System.out.println(integer);
    } //3 6 9
    
    // ArrayList considers ordering
    // set()
    integers.set(1,10); // update the 2nd element (index=1)
    for (Integer integer : integers) {
      System.out.println(integer);
    } // 3 10 9

    // get()
    System.out.println(integers.get(2)); // 9

    // size()
    System.out.println(integers.size()); // 3

    // add null
    integers.add(null);
    System.out.println(integers.size()); // 4

    // isEmpty
    System.out.println(integers.isEmpty()); // false

    // remove by index
    Integer removed = integers.remove(2); //
    System.out.println(removed);
    System.out.println(integers.size()); // 3
    System.out.println(integers.get(0)); // 3
    System.out.println(integers.get(1)); // 10
    System.out.println(integers.get(2)); // null

    // remove by object
    boolean isThereTen = integers.remove(Integer.valueOf(10));
    System.out.println(isThereTen);
    System.out.println(integers.size()); // 2
    System.out.println(integers.get(0)); // 3
    System.out.println(integers.get(1)); // null

    // contains
    System.out.println(integers.contains(3)); // true
    System.out.println(integers.contains(null)); // true
    System.out.println(integers.contains(9)); // false

    // subList
    System.out.println(integers.subList(0,1)); // 3
    System.out.println(integers); // 3, null
    System.out.println(integers.subList(0,integers.size())); // 3, null
   
    ArrayList<Integer> integers2 = new ArrayList<>();
    integers2.add(1000);
    integers2.add(2200);

    // addAll()
    integers2.addAll(integers); // add another ArrayList to another ArrayList
    System.out.println(integers2); // [1000, 2200]
    System.out.println(integers); // [1000, 2200, 3 , null]

    // indexOf, find the first
    System.out.println(integers2.indexOf(1000)); // 0
    integers2.add(1000);

    // lastIndexOf, find the last 
    System.out.println(integers2.lastIndexOf(1000)); // 4
    
    // add(index, element) -> insert
    System.out.println(integers2);
    integers2.add(2, 1500);
    System.out.println(integers2);

    // removeAll()
    ArrayList<Integer> removeList = new ArrayList<>();
    removeList.add(2200);
    removeList.add(1500);
    System.out.println(removeList);
    integers2.removeAll(removeList);
    System.out.println(integers2); // 

    // Conversion to Array (ArrayList to Array)
    // ArrayList<Integer> -> Integer[]
    Integer[] arr = integers2.toArray(new Integer[0]);
    System.out.println(Arrays.toString(arr));

    Object[] arr2 = integers2.toArray();
    Integer[] result = new Integer[arr2.length];
    int k = 0;
    for (Object obj : arr2) {
      if (obj == null) {
        // System.out.println(obj.getClass()); // class
        result[k++] = null;
      } else if (obj instanceof Integer) {
        result[k++] = (Integer) obj;
      }
    }
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(result));

  }

}
