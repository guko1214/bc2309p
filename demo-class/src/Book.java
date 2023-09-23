public class Book { // A template to describe the objects
  
  // what is instance? means object
  
  int noOfPages; // instance variable
  
  String author; // instance variable

  // instance method (An instance means an object)
  public void setAuthor(String author) { // no static here!

    this.author = author; // "this" means the object declared according to the class "Book", 
    // "author" means the attribute of the class -> "author"
    // thus, this.author mean the "author" of the object declared 

    //int y = 3;
    //this.author = author + String.valueOf(y);    
  }
  
  public String getAuthor() {
    return this.author;
  }

  public void setnoOfPages(int noOfPages) {
    this.noOfPages = noOfPages;
  }

  public int getnoOfPages() {
    return this.noOfPages;
  }

  public String toString() {
    return "author=" + this.author //
    + ", noOfpages=" + this.noOfPages;
  }

  public String print1() {
    return "Hello";
  }

  public static String print2() {
    return "Hello";
  }

  // static method cannot be associated to the object
  // We use Class name to call static method, i.e. Book.print()
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.setAge(8); // instance method
    System.out.println(person1.print1());
    System.out.println(Book.print2()); // Hello // Static method
  }

}
