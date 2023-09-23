public class Person {
  
  int age;

  char gender; // 'M' 'F'

  String firstName;

  String lastName;
  
  int hkid;

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
  }


  public boolean isElderly() {
    if (this.age > 65)
      return true;
    return false;
  }

  public String isElderlyStr() {
    String str;
    if (this.isMale()) {
      str = "He";
    } else {
      str = "She";
    }
    if (this.isElderly())
      return str + " is elderly";
    return str +" is not elderly";
  }

  public String getFullname(){
    return this.firstName + " " + this.lastName;
  }

  public boolean isMale() {
    if (this.gender == 'M')
      return true;
    return false;
  }

  public String print1() {
    return "Hello";
  }

  public static String print2() {
    return "Hello";
  }  

  public static String getFullname(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static void main(String[] args) { // static method cannot be associated to the object
    
    Book book1 = new Book(); // book1 is an object
    //System.out.println(book1.author);
    book1.setAuthor("John");
    book1.setnoOfPages(68);
    System.out.println(book1.getAuthor()); // John
    System.out.println(book1.getnoOfPages()); // 68
    //book1.noOfPages = 9;
    //System.out.println(book1.noOfPages);
    System.out.println(book1.toString());

    Book book2 = new Book(); // book2 is another object;
    //book2.setAuthor("Tom");
    //book2.setnoOfPages(123);
    System.out.println(book2.getAuthor()); // null
    System.out.println(book2.getnoOfPages()); // 0

    Person person = new Person();
    person.setAge(65);
    System.out.println(person.isElderly());
    person.setfirstName("Derrick");
    person.setlastName("Shum");
    System.out.println(person.getFullname());
    person.setGender('M');


    Person person2 = new Person();
    person2.setAge(73);
    person2.setGender('M');
    if (person.isElderly() && !person.isMale()) {
      System.out.println("this is female elderly");
    }
    if (person2.isElderly() && person2.isMale()) {
      System.out.println("this is male elderly");
    }

    System.out.println(person.isElderlyStr());
  }
  

}