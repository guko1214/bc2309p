public class Teacher extends Person { // Child Class
  
  // private String name;

  // private int age;

  private String staffID;

  public void setStaffID(String staffID) {
    this.staffID = staffID;
  }

  public String getStaffID() {
    return this.staffID;
  }

  public static void main(String[] args) {
    
    Teacher teacher = new Teacher();
    teacher.setAge(38);
    teacher.setName("Peter");

    System.out.println(teacher);

    System.out.println(teacher.getAge());
    System.out.println(teacher.getName());
    
  }

}
