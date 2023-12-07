@FunctionalInterface
public interface Flyable { // FunctionalInterface
  
  void fly();

  //void read();

  public static void main(String[] args) {
   Flyable f = new Superman();
   
   // Chapter 27 - Anonymous Inner Class
   Flyable f2 = new Flyable() {
    @Override
    public void fly() {
      System.out.println("Im flying 2 ...");
    }
    // @Override
    // public void read() {
    //   System.out.println("Im reading 2 ...");
    // }
   };

   // Lambda -> "() ->" just like "new"
   Flyable f3 = () -> {
    System.out.println("im flying 3 ...");
   };

   Readable r1 = () -> {
    System.out.println("im reading 1 ... ");
   };
   
   System.out.println("f Class =" + f.getClass());
   System.out.println("f2 Class =" + f2.getClass());
   System.out.println("f3 Class =" + f3.getClass());
   System.out.println("r1 Class =" + r1.getClass());

   f.fly();
   f2.fly();
   f3.fly();
   r1.read();
   


  }

}
