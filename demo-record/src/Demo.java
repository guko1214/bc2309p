public class Demo {
  

  public static void main(String[] args) {
    Book book = new Book("ABC", "John");
    //Book book2 = new Book("ABC", "John");
    // There is no No-arg constructor
    // Book book2 = new Book();
    
    // getter, setter ?
    // toString, equals, hashCode()?


    // Getter
    System.out.println(book.bookName());
    System.out.println(book.authorName());
    // System.out.println(book.bookName);
    // System.out.println(book.authorName);

    // Private Attributes
    //System.out.println(book.authorName); // Cannot access attribute, so it is private

    // No Setter in Java record

    // toString()
    System.out.println(book.toString());
    Book book2 = new Book("ABC", "John");
    System.out.println(book.equals(book2)); // true

    System.out.println("book hashCode=" + book.hashCode());
    System.out.println("book2 hashCode=" + book2.hashCode());

    Book book3 = new Book("ABCD", "John");
    System.out.println(book3.hashCode());

    Book book4 = new Book(null, "Peter");
    
  }
}
