package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
// public class Book {
  
  private String name;

  private double price;

  public Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Book(name="+ this.name + ", price=" + this.price + ")";
  }

  @Override
  public int compareTo(Book book) { // the larger price, come first
    // sort descending, if other larger than self,return 1, else return -1
    // sort ascending, if other larger than self, return -1, else return 1

    if (book.getPrice() > this.price) 
      return 1;
    return -1;
  }

  public static void main(String[] args) {
    //List<Book> books = List.of(new Book("A",30.5), new Book("B", 50.8), new Book("C", 40.9));
    List<Book> books = new ArrayList<>(
        List.of(new Book("A",30.5), new Book("B", 50.8), new Book("C", 40.9)));
    System.out.println(books); 
    // [Book(name=A, price=30.5), Book(name=B, price=50.8), Book(name=C, price=40.9)]
    // Sorting
    Collections.sort(books);
    System.out.println(books); 
    // [Book(name=B, price=50.8), Book(name=C, price=40.9), Book(name=A, price=30.5)]
  }

}
