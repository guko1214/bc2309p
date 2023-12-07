public interface Readable {
  
  public void read();

  public static void main(String[] args) {
    Readable r1 = () -> {
      System.out.println("im reading 1 ... ");
     };

     System.out.println("r1 class=" + r1.getClass());
  }


}
