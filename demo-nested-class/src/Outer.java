public class Outer {
  
  private String name1;

  private static int value = -20; // Outer.value


  public Outer (String name) {
    this.name1 = name;
  }

  public void display() {
    System.out.println("Outer name1=" + this.name1);
  }

  public class InnerClass {

    private String name3;

    public InnerClass(String name) {
      this.name3 = name;
    }

    public void display() {
      System.out.println("Outer name1=" + name1 + ", Inner name3=" + this.name3);
    }

  }


  public static class NestedClass { // Outer.NestClass

    // static class is a independent class inside outer class
    private String name2;
    private int age;

    public NestedClass (String name) {
      this.name2 = name;
    }

    public void display() {
      //System.out.println(this.name2 + " " + this.name1); // name1 is not attribute of NestedClass 
      // Outer class and static nested class not talk to each other, so nextedClass cannot call name1 which belong to Outer class
      System.out.println(this.name2 + " " + Outer.value);
    }

  


  }




}
