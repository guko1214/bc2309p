import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    
    List<String> strings = new ArrayList<>();
    strings.add("hello");
    strings.add("world");
    strings.add("world");
    System.out.println(strings);

    Set<String> strings2 = new HashSet<>();
    System.out.println(strings2.add("hello"));
    System.out.println(strings2.add("world"));
    System.out.println(strings2.add("world"));
    System.out.println(strings2);

    List<String> strs = List.of("hello","world","hello","hello","XYZ"); // only use List.of("...", "...") to declare (on new ArrayList<>),just allow get(n), would not allow add, remove, etc, operation.
    List<String> strList = new ArrayList<>(List.of("hello","world","hello","hello","XYZ"));

    int count = 0;
    for (String s : strs) {
      if (s.equals("hello")) {
        count++;
      }
    }
    // Count duplicated elements
    System.out.println(countTarget(strs, "hello"));
    // 2. Filter out duplicated elements
    filterDuplicated(strList);
    System.out.println(strList); // [world, XYZ, hello]

    System.out.println(strs.size()); // 5

    Set<String> set = new HashSet<>();
    set.add("abc");
    System.out.println(set.size()); // 1
    

  }

  public static int countTarget(List<String> list, String target) {
    int count = 1;
    Set<String> strs = new HashSet<>();    
    for (String str : list) {
      if (!strs.add(target) && str.equals(target) ) {
        count++;
      } 
    }
    return count;
  }

  public static void filterDuplicated(List<String> list) {
    Set<String> strings = new HashSet<>();
    for (String str: list) {
      strings.add(str);
    }
    //list.removeAll(list);
    list.clear();
    // while (!(list.isEmpty())) {
    //    list.remove(0);
    // }
    for (String str: strings) {
      list.add(str);
    }
  }

}
