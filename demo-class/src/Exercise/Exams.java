package Exercise;

public class Exams {
  public static void main(String[] args) {
    
    Exam exam = new Exam();

    //System.out.println("1no of subjects=" + Exam.size);
    System.out.println("no of subjects=" + Exam.getsize());

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

    //System.out.println("no of subjects=" + Exam.size);

    Exam exam2 = new Exam();
    Subject subject7 = new Subject("History", 85);
    Subject subject8 = new Subject("Arts", 35);
    exam2.addsubject2(subject7);
    exam2.addsubject2(subject8);

    //System.out.println("no of subjects=" + Exam.size);

    // private static variable
    // so, we cannot get the static variable
    System.out.println("no of subjects=" + Exam.getsize());

  }
}
