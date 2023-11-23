import java.util.Comparator;

public class SortByStudentCustomSort implements Comparator<Student> {
  
  @Override
  public int compare(Student x, Student y) {
    if (y.getAge() > x.getAge()) {
      return 1;
    } else if (y.getAge() < x.getAge()) {
      return -1;
    } else {
      if (y.getName().compareTo(x.getName()) > 0) {
        return -1;
      } else {
        return 1;
      }
    }
      
  }

}
