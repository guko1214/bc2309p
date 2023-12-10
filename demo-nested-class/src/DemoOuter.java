public class DemoOuter {
  
  
  
  public static void main(String[] args) {

    Outer outer = new Outer("ABC");
    // NestedClass nestedClass = new NestedClass(); cannot call
    Outer.NestedClass staticNestedClass = new Outer.NestedClass("ABC");

    staticNestedClass.display();

    //Company.Employee employee = new Company.Employee("John", 123); // -> static?
    Company.Employee employee = Company.createEmployee("John", 123);

    Employee employee2 = new Employee();

    //Outer.InnerClass inner = new Outer("DEF").new InnerClass("IJK");
    Outer outer2 = new Outer("DEF");
    Outer.InnerClass inner = outer2.new InnerClass("IJK");
    
    inner.display(); // 
    outer2.display();

    // Example Inner Class
    Library library1 = new Library("ABC");
    //Library.Book b1 = library1.new Book("Book 1"); // library.valueOf("Book1")
    Library.Book b1 = library1.crateBook("Book1");
    System.out.println("book1 info=" + b1.info()); // book1 info=ABCBook1


    }
}
