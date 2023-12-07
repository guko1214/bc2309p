public class Cat {
  
  public String name;

  public void setName(String name) {
    this.name = name;
  }

  public void run() {
    System.out.println(this.name + " is running ....");
  }

  public Cat name(String name) {
    this.name = name;
    return this;
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.name("Jenny").run();
  }

}
