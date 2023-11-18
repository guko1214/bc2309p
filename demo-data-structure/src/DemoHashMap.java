import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  
  private static int keyCount;

  public static void main(String[] args) {

    // <key, value> pair -> Entry
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("A", "John");
    System.out.println(stringMap.get("A"));
    stringMap.put("A", "Mary");
    stringMap.put("A2", "Sally");
    stringMap.put(null, "Oscar"); // null are allowed as key, but should avoid
    stringMap.put(null, "Cherry"); 
    System.out.println(stringMap.get("A")); // Mary
    System.out.println(stringMap.get("A2")); // Sally
    System.out.println(stringMap.get(null)); // Cherry

    // HashMap not guarantee the order, order lost
    // Loop Map.Entry -> entrySet()
    for (Map.Entry<String, String> entry: stringMap.entrySet()) {
      System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
    }

    // Loop value -> values()
    for (String value : stringMap.values()) {
      System.out.println("value=" + value);
    }

    // keySet()
    for (String key : stringMap.keySet()) {
      System.out.println("key=" + key);
    }

    System.out.println(stringMap.containsKey("A2")); // true
    
    String[] strings = {"Cherry", "hello", "Oscar", "oscar", "Vincent"};
    //int i = 0;
    // check if the value exists in map, if no, add into the map, if yes, print "Cherry already exist"
    //for (int i = 0; i < strings.length; i++) {
    for (String name : strings) {
      //if (stringMap.containsValue(strings[i])) { 
      if (stringMap.containsValue(name)) {
        //System.out.println(strings[i] + " already exist");
        System.out.println(name + " already exist");
      }
       else {
         //stringMap.put(generateKey(),strings[i]);
         stringMap.put(generateKey(),name);
      }
    }

    System.out.println(stringMap);
  }

  public static String generateKey() {
    return "G" + ++keyCount;
  }

}
