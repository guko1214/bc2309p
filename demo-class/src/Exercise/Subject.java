package Exercise;

public class Subject {
  
  private String description;

  private int score;

  public Subject() {

  }

  public Subject(String description, int score) {
    this.description = description;
    this.score = score;
  }

  public char getgrade() {
    //char grade = ' ';
    // case (this.getscore()) {
    //   case 90:
    //    grade = 'A';
    //   default:
    //   grade = 'F';
    // }
    score = this.getscore();
    if (score >= 90) 
      return 'A';
    else if (score >= 80)
      return 'B';
    else if (score >= 70)
      return 'C';
    else if (score >= 60)
      return 'D';
    else if (score >= 50)
      return 'E';
    else 
     return 'F';
  }

  private int getscore() {
    return this.score;
  }

  public void setdescription(String description) {
    this.description = description;
  } 

  public String getdescription() {
    return this.description;
  }

  public void setscore(int score) {
    this.score = score;
  }

  public static void main(String[] args) {
    // instance method to calculate the average score of the exam
    
      Exam exam = new Exam();
  
      System.out.println("1no of subjects=" + size);
  
      exam.addsubject1("Chi", 53);
      Subject subject1 = new Subject("Eng", 40);
      exam.addsubject2(subject1);
      Subject subject2 = new Subject("Math", 80);
      exam.addsubject2(subject2);
      exam.addsubject2(new Subject("Phy", 60));
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
      exam.delete(subject2);
  
      for (int i = 0; i < exam.getsubjects().length; i++) {
        Subject s = exam.getsubjects()[i];
        if (s != null) {
          System.out.println(s.getdescription() + "=" + s.getscore());
        }
      }
      System.out.println(exam.averagescore());
      System.out.println("2no of subjects=" + exam.size());
      System.out.println("The subject get the highest score is " + exam.highestscoresubject());
      exam.delete(new Subject("Arts",43));
  }


}
