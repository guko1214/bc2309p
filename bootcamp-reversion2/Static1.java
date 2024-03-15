public class Static1 {
  
  // static variable, static method

  private int x;

  public void setX(int x) {
    this.x = x;
  }

  private static int age = 0;
  private static int age1 = 10;

  public static int getAge() {
    return age;
  }

  public static void main(String[] args) {

    Static1 static1 = new Static1();
    static1.setX(10);

    Static1 static2 = new Static1();
    static2.setX(100);

    System.out.println(Static1.age); // 0
    System.out.println(Static1.age1); // 
    

    // call API/ call DB -> Auto-GC -> Remove Object static1 and static2
  }


}
