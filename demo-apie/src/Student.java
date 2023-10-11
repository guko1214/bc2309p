public class Student extends Person { // Child Class, 
  // only inherited all public, not private attributes, methods
  // for constructor, neither private nor public would be inherited
  private String studentID;

  // All-args constructor

  public Student(String studentID) {
    //super(); // calling parent class empty constructor
    // super() like the empty constructor that still here if not written
    // if in work, don't write the "super()", it seem stupid
    this.studentID = studentID;
  }

  public Student(String name, int age, String studentID) {
    super(name,age); // calling parent clase constructor
    this.studentID = studentID;
  }

  public Student() {

  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public String getStudentID() {
    return this.studentID;
  }

  // public String toString() {
  //   return "name=" + this.getName()  //
  //   + ", age=" + this.getAge() //
  //   + ", StudentID=" + this.getStudentID();
  // }

  public static void main(String[] args) {
    Student student = new Student();
    student.setAge(20);
    student.setName("John");
    System.out.println(student.getName());
    System.out.println(student.getAge());

    Person person = new Person();
    person.setAge(40);
    person.setName("Mary");

    Student student2 = new Student("john",13,"s9830");
    System.out.println(student2.getName());
    System.out.println(student2.getAge());
    System.out.println(student2.getStudentID());
    System.out.println(student2.toString()); // do not require .toString(), 
    // if call the object alone, it actually call object.toString()
    // the default toString() call the object reference
    System.out.println(student2); 

    System.out.println(Person.x); // hello (the best way to call)
    System.out.println(Student.x); // hello
    System.out.println(Teacher.x); // hello
    //System.out.println(person.x);  // hello
    //System.out.println(student2.x); // hello; object can access class variable, but should not access in this way

    System.out.println(Person.getY()); // 10 (the best way to call)
    System.out.println(Student.getY()); // 10
    System.out.println(Teacher.getY()); // 10
    //System.out.println(person.getY()); // 10
    //System.out.println(student2.getY()); // 10

    System.out.println(student2.s); // inherited from Person, (default value for int is 0)

  }

}
