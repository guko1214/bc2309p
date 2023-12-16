import java.util.Objects;

public class Book2 {
  
  private String bookName;
  private String authorName;

  public Book2(String bookName, String authorName) {
    this.bookName = bookName;
    this.authorName = authorName;
  }

  public String bookName() {
    return this.bookName;
  }

  public String authorName() {
    return this.authorName;
  }

  @Override
  public String toString() {
    return "Book2(boo/Name=" + this.bookName + ", authorName=" + this.authorName + ")";
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.bookName) + Objects.hash(this.authorName);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Book2))
      return false;
    Book2 book2 = (Book2) obj;
    return book2.bookName.equals(this.bookName) && book2.authorName().equals(this.authorName);


  }

}

