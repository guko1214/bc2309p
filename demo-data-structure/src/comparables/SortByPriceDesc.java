package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPriceDesc implements Comparator<Book> {
  
  public int compare(Book o1, Book o2) {
    return o2.getPrice() > o1.getPrice() ? 1 : -1; // descending
    //return o2.getPrice() > o1.getPrice() ? 1 : -1; // asscending
  }

  public static void main(String[] args) {
    
      List<Book> books = new ArrayList<>(
      List.of(new Book("A",30.5), new Book("B", 50.8), new Book("C", 40.9)));
      System.out.println(books);
      Collections.sort(books, new SortByPriceDesc());
      System.out.println(books);
  }

}
