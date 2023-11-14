import java.util.ArrayList;

public class School {
  
  // One to many example e.g. one school have many students
  private ArrayList<Student> students; // Student[] students;

  public School() {
    this.students = new ArrayList<>(); // should create in empty constructor
  }

  public ArrayList<Student> getStudents() {
    return this.students;
  }

  @Override
  public String toString() {
    return "School(" //
      +"students=" + this.students.toString() //
      + ")";
  }

  public boolean addStudent(Student student) {
    return this.students.add(student);
  }



  public static void main(String[] args) {
    School school = new School();
    System.out.println(school.addStudent(new Student(15, "Mary")));
    System.out.println(school); // School(students=[Student(age=15, name=Mary)])
    System.out.println(school.addStudent(new Student(16, "Ben")));
    System.out.println(school); // School(students=[Student(age=15, name=Mary), Student(age=16, name=Ben)])
  } 


}
