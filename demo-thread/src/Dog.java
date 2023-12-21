public class Dog {
  
  private String name;

  private static int age;

  public Dog(String name) {
    this.name = name;
    //this.age = 0;
  }

  public synchronized void setName(String s) {
    this.name = this.name.concat(s);
  }

  // public void setAge(int age) {
  //   this.age = age;
  // }

  public static synchronized void addAge() {
    Dog.age++;
  }

  public void subtractAge() {
    age--;
  }

  public static void main(String[] args) throws InterruptedException {

    Dog dog = new Dog("");



    Runnable task = () -> {
      for (int i = 0; i < 1000000; i++) {
        dog.setName("A");
        addAge();
      }
      
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);
    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(Dog.age);
    System.out.println(dog.name.length());
  }


}
