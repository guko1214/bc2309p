public class Maths {
  public static void main(String[] args) {
    System.out.println(Math.min(19,7)); // 7
    System.out.println(Math.max(4,7)); // 7
    System.out.println(Math.abs(-7)); // 7
    System.out.println(Math.abs(7)); // 7
    System.out.println(Math.pow(2,10)); // 1024.0
    System.out.println(Math.sqrt(9)); // 3
    System.out.println(Math.floor(9.9)); // 9
    System.out.println(Math.ceil(9.2)); // 10
    
    System.out.println(Math.round(5.44)); // 5
    System.out.println(Math.round(5.45)); // 5
    System.out.println(Math.round(5.5)); // 6

    System.out.println(Math.random()); // 0 - 0.99999....
    System.out.println((int) (Math.random() * 1000));

    System.out.println(Maths.pow(2,3));
    System.out.println(Maths.min(19,7));
    System.out.println(Maths.floor(3.0)==Math.floor(3.0));
    System.out.println(Maths.floor(3.3)==Math.floor(3.3));
    System.out.println(Maths.floor(3.8)==Math.floor(3.8));
    System.out.println(Maths.ceil(3.0)==Math.ceil(3.0));
    System.out.println(Maths.ceil(3.3)==Math.ceil(3.3));
    System.out.println(Maths.ceil(3.8)==Math.ceil(3.8));
    System.out.println(Maths.abs(7));


    
  }

  public static double pow(double base, int power) { // base > 0 && power > 0
      if (power < 0)
        return 0;
      if (base == 0)
        return 1.0;
      if (power == 1)
        return base;
      double result = base;
      for (int i = 2; i <= power; i++) { // this is correct one
        result *=  base;
      }
      return result;
    }


    public static int min(int a, int b) {
      // if (a < b)
      //   return a;
      // return b;
      return a > b ? b : a; // ****** awesome!!!!!!!!
    }

    public static double floor(double a) {
     //if (((int) a) == a)
     //   return (int) a;
      return (double)((int) a);
    }

    public static double ceil(double a) {
      if (((int) a) == a)
        return (double)((int) a);
      return (double)(((int) a) + 1);
    }

    public static int abs(int a) {
      return a > 0 ? a : a * -1;
    }
}
