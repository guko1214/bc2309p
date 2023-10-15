public class SmallBird extends Bird {
  
  // Cannot override the "final" fly() method in Bird.class
  // @Override
  // public void fly() {

  // }

  public SmallBird(String name) {
    super(name);
    //super.valueOf(name);
  }

  public static void main(String[] args) {
    //Bird b1 = new Bird("John");
    Bird b2 = Bird.valueOf("John");
    System.out.println(b2.toString());

    Bird b3 = new SmallBird("John");
    System.out.println(b3.toString());
    System.out.println(b3.getClass());

    SmallBird sm1 = new SmallBird("ABC");
    System.out.println(sm1.equals("abc"));

    b2.setAge(2);
    b3.setAge(2);
    System.out.println(b2.equals(b3));

  }

}
