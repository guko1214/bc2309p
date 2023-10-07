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

  Subject[] subjects;

  private static int size = 0;

  static final int  noOfdayOfweek = 7; 

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

  public static void main(String[] args) {
    
    Exam exam = new Exam();

    System.out.println("1no of subjects=" + size);

    exam.addsubject1("Chi", 53);
    Subject subject1 = new Subject("Eng", 40);
    exam.addsubject2(subject1);
    exam.addsubject2(new Subject("Math", 80));
    exam.addsubject1("Phy", 60);
    exam.addsubject1("Chem", 70);
    exam.addsubject1("Bio", 55);
    
    System.out.println(exam.averagescore());

    System.out.println("2no of subjects=" + exam.size());
  
    for (int i = 0; i < exam.getsubjects().length; i++) {
      Subject s = exam.getsubjects()[i];
      if (s != null) {
        System.out.println(s.getdescription() + "=" + s.getscore());
      }
    }

    System.out.println("no of subjects=" + Exam.size);

    Exam exam2 = new Exam();
    Subject subject7 = new Subject("History", 85);
    Subject subject8 = new Subject("Arts", 35);
    exam2.addsubject2(subject7);
    exam2.addsubject2(subject8);

    System.out.println("no of subjects=" + Exam.size);

    // private static variable
    // so, we cannot get the static variable
    // only when the the main is not wrote in the same class file
    // if wrote in the same file, the private variable can still be accessed
    System.out.println("no of subjects=" + getsize());

    System.out.println("The subject get the highest score is " + exam.highestscoresubject());

  }

  public static int getsize() {
    return size;
  }

}
