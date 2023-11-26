package Revision;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RevisionArrayList {
  
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book(30.0, "ABC"));
    books.add(new Book(45.5, "DEC"));
    books.add(new Book(100.2, "OKM"));

    //System.out.println(books);
    // for-each loop -> "ABC,30.0"
    for (Book b: books) {
      System.out.println(b.getAuthor() + "," + String.valueOf(b.getPrice()));
    }
    // ABC,30.0
    // DEC,45.5
    // OKM,100.2

    BigDecimal total = BigDecimal.valueOf(0);
    for(Book b: books) {
      total = total.add(BigDecimal.valueOf(b.getPrice()));
    }
    BigDecimal size = BigDecimal.valueOf(books.size());
    System.out.println(total.divide(size, RoundingMode.UP));
    double averagePrice = total.divide(size, RoundingMode.UP).doubleValue();
  
    System.out.println("The average price of books = (" + String.valueOf(total.doubleValue()) +
       " /"+ String.valueOf(size.doubleValue()) + ")");
    System.out.println("The average price of books = (" + String.valueOf(averagePrice) + ")");       
    // The average price of books = (175.7 /3)
    List<Book> books2  = new ArrayList<>();
    books2 = books.subList(2, books.size() - 1); 
    // books refer to original list books
    Book removed = books.remove(0);
    //System.out.println(removed);

    // remove all books with price > 50   

    for (Book b: books) { // in for-each, don't do modification which in not allowed
      if (b.getPrice() > 50.0) {
        //books.remove(b);  // java.util.ConcurrentModificationException
        System.out.println("book=" + b);
      }
    }
    
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getPrice() > 50.0) {
        removed = books.remove(i);
        System.out.println("removed books=" + removed);
      }
    }
    System.out.println(books);

    // Add all the books to set collection (HashSet)
    Set<Book> bookSet = new HashSet<>();
    for (Book b: books) {
      bookSet.add(b);
    }
    System.out.println(bookSet);

    // Add all the books to an Array(Book[])
    Book[] bookArray = new Book[books.size()];
    int idx = 0;
    for (Book b: books) {
      bookArray[idx++] = b;
    }
    System.out.println(Arrays.toString(bookArray));
  //  System.out.println(books2);


  }

}
