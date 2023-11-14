import java.util.Objects;

public class Student {
  
  private int age;

  private String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Student))
      return false;
    Student student = (Student) obj;
    return Objects.equals(this.age, student.age) 
        && Objects.equals(this.name, student.name); 
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.age, this.name);
  }

  @Override
  public String toString() {
    return "Student(age="+ this.age + ", name=" + this.name +")";
  }

}
