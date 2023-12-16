public record Book(String bookName, String authorName) {
  
  public static final int NUM = 10;
  public static String bookstore = "ABC";

  public Book { // modify the all-args constructor
    if (bookName == null || authorName == null) {
      throw new IllegalArgumentException();
    }
  }
  // public LocalDate publishDate;

  // public Book() {
    
  // }

  // All attriubtes has been "final"
 //public void setBookName(String bookName) { 
  //   this.bookName = bookName;
  // }

  public static int add(int x, int y) {
    return x + y;
  }

  public void publish() {
    System.out.println(this.authorName + " " + this.bookName);
  }

}
