package Revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevisionHashMap {


  public static int counter = 0;
  public static final String KEY_PREFIX = "B";

  public static String genKey() {
    return KEY_PREFIX + String.valueOf(++counter);
  }

  public static Book putNew(Map<String, Book> bookMap, Book book) {
    //String key = genKey();
    // return (key new Book(price, name));
    bookMap.put(genKey(), book);
    return null;
  }
  

  
  public static void main(String[] args) {
    
    // key -> "B1", "B2", "B3"
    Map<String, Book> bookMap = new HashMap<>();
    bookMap.put(RevisionHashMap.genKey(), new Book(40.5, "John"));
    bookMap.put(RevisionHashMap.genKey(), new Book(70.0, "Alan"));
    System.out.println(bookMap);

    List<Book> books = new ArrayList<>();
    for (Map.Entry<String, Book> entry: bookMap.entrySet()){
      //System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
      books.add(entry.getValue());
    }
    System.out.println(books);

    RevisionHashMap.putNew(bookMap, new Book(30.2, "Mary"));
    System.out.println(bookMap);

    // put new Book if key not exist
    String bookKey = "B3";
    System.out.println(bookMap.containsKey(bookKey));
    if (!bookMap.containsKey(bookKey)) {
      //RevisionHashMap.putNew(bookMap, new Book(34.5, "Kelvin"));
      bookMap.put(bookKey, new Book(40.5, "Sally"));
    }
    System.out.println(bookMap);
    String bookKey2 = "B4";
    if (!bookMap.containsKey(bookKey2)) {
      //RevisionHashMap.putNew(bookMap, new Book(34.5, "Kelvin"));
      bookMap.put(bookKey2, new Book(40.5, "Tommy"));
    }
    System.out.println(bookMap);

    System.out.println("key=B2=" + bookMap.get("B2"));

  }

}
