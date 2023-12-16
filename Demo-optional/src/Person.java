import java.util.Optional;

// Optional<T> should NOT be used for defining the type of attribute
// 1. Call API, this class may be used for deserialization, then Optional<T> may have some problems.
// 2. Interact with Database, deserialization for the Optional<T> field have issue.
public class Person {
  
  private String name;

  private Optional<String> emailAddress; // NOT OK, wrong design

  public Person(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public Optional<String> getEmailAddress() { // NOT OK
    return this.emailAddress;
  }

  public void setEmailAddress(String s) { // NOT OK
    // if (s == null)
    //   throw new IllegalArgumentException();
    //this.emailAddress = Optional.of(s);
    this.emailAddress = Optional.ofNullable(s);
  }

}
