public abstract class Parent {
  
  abstract void read();

  public static void main(String[] args) {
    Parent parent = new Parent() {
      @Override
      public void read() {
        System.out.println("hello");
      }
    };

    parent.read();

  }


}
