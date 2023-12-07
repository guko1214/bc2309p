public class Library {
  
  public String prefix;

  public Library(String prefix) {
    this.prefix = prefix;
  }

  public Book crateBook(String id) {
    return this.new Book(id);
  }

  public class Book {
    private String id;

    public Book(String id) {
      this.id = id;
    }

    public String info() {
      return prefix + this.id;
    }

  }


}
