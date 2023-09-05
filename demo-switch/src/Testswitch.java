public class Testswitch {
  public static void main(String[] args) {
    int score = 80;
    char grade = ' ';

    // switch example 1
    switch(score) {
      case 90: // ~ for any case, if score >= case value will run, to apply for real use add break in end of each case, see example 2
        grade = 'A'; // 2, execute
        System.out.println("case 90");
        System.out.println(grade);
        // break;
      case 80:
        grade = 'B';
        System.out.println("case 80");
        System.out.println(grade);
        // break;
      case 70:
        grade = 'C'; 
        System.out.println("case 70");
        System.out.println(grade);
        // break;
      case 60:
        grade = 'D';
        System.out.println("case 60");
        System.out.println(grade);
        // break;
      default:
        grade = 'F';
        System.out.println("default case");
        System.out.println(grade);
    }
    System.out.println("The grade is " +grade);

    // switch example 2
    switch(score) {
      case 90: // 1, match
        grade = 'A'; // 2, execute
        // System.out.println("case 90");
        break;
      case 80:
        grade = 'B';
        // System.out.println("case 80");
        break;
      case 70:
        grade = 'C'; 
        // System.out.println("case 70");
        break;
      case 60:
        grade = 'D';
        // System.out.println("case 60");
        break;
      default:
        grade = 'F';
        // System.out.println("default case");
    }
    System.out.println("The grade is " +grade);

    // Alternative
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("The grade is " + grade);
  }
}