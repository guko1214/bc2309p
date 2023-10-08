package Exercise;

// Summary (5-Oct)
// - static variable
// - default empty constructor
// - static method can call static variable
// - instance method can call static variable
// - can static method call instance variable??? why???
// - instance mehtod can call instance variable (getter, setter)
// - what is the meaning of "no setter"?

public class Exam {

  // Access Modifier: public, private, protected, package-private (default)
  // public -> class, attribute, method, constructor
  // private -> attribute, method, constructor
  // protected -> attribute, method, constructor
  // package-private -> class, attribute, method, constructor
  private Subject[] subjects;

  private static int size = 0;

  private static final int noOfdayOfweek = 7; // Camel Case

  public Exam() {
    this.subjects = new Subject[100];
  }

    public Exam(Subject subject) {
    this.subjects = new Subject[100];
    this.subjects[0] = subject;
    size++; // constructor can change the static variable
  }
  
  public void addsubject1(String description, int score) {
    for (int i = 0; i < this.getsubjects().length; i++) {
      if (this.getsubjects()[i] == null) {
        this.getsubjects()[i] = new Subject();
        this.getsubjects()[i].setdescription(description);
        this.getsubjects()[i].setscore(score);
        size++;
        break;
      }
    }
  }

  public void addsubject2(Subject subject) {
    for (int i = 0; i < this.getsubjects().length; i++) {
      if (this.getsubjects()[i] == null) {
        this.getsubjects()[i] = subject;
        size++; // instance method can change the the static variable 
        // if there are multiple objects, all object can change the static variable (the same static variable)
        break;
      }
    }
  }

  public boolean delete(Subject subject) {
    subjects = this.getsubjects();
    for (int i = 0; i < subjects.length; i++) {
      if (subjects[i] != null //
        && subject != null //
        && subjects[i].getdescription()
        .equals(subject.getdescription())) {
        this.subjects[i] = null;
        size--;
        return true;
      }
    }
    return false;
  }

  public Subject[] getsubjects() {
    return this.subjects;
  }

  public int size() {
    int size = 0;
    for (int i = 0; i < this.subjects.length; i++) {
      if (this.subjects[i] != null) {
        size++;
      }
    }
    return size;
  }

  public double averagescore() {
    // instance method to calculate the average score of the exam
    double averagescore = 0;
    for (int i = 0; i < this.getsubjects().length; i++) {
      if (this.getsubjects()[i] != null) {
        averagescore += this.getsubjects()[i].getscore();
      }
    }
    if (this.size() > 0 )
      return averagescore/this.size();
    return 0;
  }

  public String highestscoresubject() {
    Subject[] subjects = this.getsubjects();
    int highestscore = 0;
    String highestsubject = "";
    for (int i = 0; i < subjects.length; i++) {
      if (subjects[i] != null && subjects[i].getscore() > highestscore) {
        highestscore = subjects[i].getscore();
        highestsubject = subjects[i].getdescription();
      } 
    }
    return highestsubject;
  }

  public static int getsize() {
    return size;
  }

  public static int getNoOfDayOfWeek() {
    return noOfdayOfweek;
  }


  public static void main(String[] args) {
    System.out.println(noOfdayOfweek);
    System.out.println(getNoOfDayOfWeek());

  }

}
