public class TestNumber {
  public static void main(String[] args) {
    Object x = 100;
    Integer x2 = 100; // Integer.class extends Number.class extends Object.class
    
    Number n = Integer.valueOf(100);
    n = Double.valueOf(10.3d);
    n = Long.valueOf(132);
    n = Float.valueOf(2.3f);

    if (n instanceof Integer) {
      System.out.println("I am Integer");
      Integer integer = (Integer) n;
      System.out.println(integer.intValue());
    } else if (n instanceof Double) {
      System.out.println("I am Double");
      Double double2 = (Double) n;
      System.out.println(double2.doubleValue());
    } else if (n instanceof Long) {
      System.out.println("I am Long");
      Long long2 = (Long) n;
      System.out.println(long2.longValue());
    } else if (n instanceof Float) {
      System.out.println("I am Float");
      Float float2 = (Float) n;
      System.out.println(float2.floatValue());
    }
    
  }

}
