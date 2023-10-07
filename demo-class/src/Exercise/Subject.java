package Exercise;

public class Subject {
  
  String description;

  int score;

  public Subject() {

  }

  public Subject(String description, int score) {
    this.description = description;
    this.score = score;
  }

  public int getscore() {
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
  }


}
