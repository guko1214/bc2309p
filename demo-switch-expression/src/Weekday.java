public enum Weekday {
  
  MONDAY(1,"Monday"), 
  TUESDAY(2, "Tuesday"), 
  WEDNESDAY(3, "Wednesday"),
  THURSDAY(4, "Thursday"), 
  FRIDAY(5, "Friday"),;

  private int id;
  private String string;
  private Weekday(int id, String string) {
    this.id = id;
    this.string = string;
  }

  public int getId() {
    return this.id;
  }

  public String getString() {
    return this.string;
  }

}
