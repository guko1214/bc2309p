public class Employee {
  
  private String name;

  public static final int HOUR_PER_DAY = 24; // often constant value wrote in uppper cast

  public static final double PI = Math.PI;

  private static String x = genx();

  static {
    // static block
    System.out.println("Step 2. this is static block");
    //x = "de";
  }

  {
    // instance block
    System.out.println("Step 3. this is initialisation block");
    //name = "abc";
    //name = x;
  }

  public static String genx() {
    System.out.println("Step 1. Start genx()");
    return "1234";
  }

  public Employee() {
    System.out.println("Step 4. This is empty constructor");
  }

  public Employee(String name) {
    System.out.println("Step 4. this is constructor");
    this.name = name;
  }

  public String getName() {    
    return this.name;
  }

  public static String getStaticX() {
    return x;
  }

  public static void main(String[] args) {
    System.out.println("Start");
    Employee employee = new Employee("John");
    Employee employee2 = new Employee();
    //Employee employee = new Employee();
    System.out.println(employee.getName());
    System.out.println(employee2.getName());
    //System.out.println(x);
    //System.out.println(getStaticX());
    System.out.println("End");
  }

}
