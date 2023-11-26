package Revision;

public class Book {
  
  private double price;

  private String author;

  private Book() {

  }

  public Book(double price, String author) {
    this.price = price;
    this.author = author;
  }

  public double getPrice() {
    return this.price;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book(price=" + this.price + ", author=" + this.author + ")";
  }

  
}
