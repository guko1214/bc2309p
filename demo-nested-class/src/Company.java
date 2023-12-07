public class Company {
  
  private String name;

  public static Employee createEmployee(String employeeName, int employeeId) {
    return new Company.Employee(employeeName, employeeId);
  }

  public static class Employee {
    private String employeeName;

    private int employeeId;

    public Employee() {

    }

    public Employee(String employeeName, int employeeId) {
      this.employeeName = employeeName;
      this.employeeId = employeeId;
    }

    public void info() {
      System.out.println("Employee Name: " + this.employeeName);
      System.out.println("Employee Id:" + this.employeeId);
    }
  }


}
