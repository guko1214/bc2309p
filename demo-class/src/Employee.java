public class Employee {
  
  private String name;

  {
    System.out.println("Step 1. this is initialisation block");
    //name = "abc";
    name = x;
  }

  private static String x;

  static {
    System.out.println("this is static block");
    x = "de";
  }

  public Employee() {
    System.out.println("This is empty constructor");
  }

  public Employee(String name) {
    System.out.println("Step 2. this is constructor");
    this.name = name;
  }

  public String getName() {    
    return this.name;
  }

  public static String getStaticX() {
    return x;
  }

  public static void main(String[] args) {
    Employee employee = new Employee("John");
    Employee employee2 = new Employee();
    //Employee employee = new Employee();
    System.out.println(employee.getName());
    System.out.println(employee2.getName());
    System.out.println(x);
    System.out.println(getStaticX());
  }

}
