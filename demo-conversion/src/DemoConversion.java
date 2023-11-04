public class DemoConversion{
  public static void main(String[] args) {
    // Primitives
    // upcast (promotion)
    // byte -> short -> int -> long (Integer)
    byte b = 10;
    short s = b; // upcast: from byte to short
    // byte b2 = s; // error
    int i = s;
    long l = i;
    int i2 = b;

    // float -> double
    float f = 12.323f;
    double d = f; // upcast

    // char -> int
    char c = 'a'; // in ascii 97
    int w = c; // upcast
    System.out.println(w); // 97
    // char c2 = w; // int // error // int 32 bit -> char 16 bit , int range larger than char
    // only shorter range datatype can convert to longer range data range
    // e.g. byte -> short, short - int, but not short -> byte

    // downcast
    short s3 = 127;
    byte b3 = (byte) s3; // 強行去downcast
    System.out.println(b3); // 127

    short s4 = 30000;
    byte b4 = (byte) s4; 
    System.out.println(b4); // java behavior (Overflow): 48

    short s5 = 128;
    byte b5 = (byte) s5;
    System.out.println(b5); // -128

    double d5 = 10.234d;
    float f5 = (float) d5;
    System.out.println(f5);

    short s6 = 32767;
    s6++;
    System.out.println(s6); //-32768

    // int -> char (6xxxx) (0-127)
    int i6 = 99; // 'c'
    char c6 = (char) i6;
    System.out.println(c6); // 'c'

    char c8 = 'A'; // 65
    char c9 = 'a'; // 97
    if (c8 > c9) { // conversion: char -> int
      System.out.println("c8 > c9 in ascii");
    } else {
      System.out.println("c9 > = c8 in ascii"); // print
    }

    byte b9 = 100;
    short s9 = 101;
    if (s9 > b9) { // conversion: byte -> short
      System.out.println("s9 > b9");
    }

    // int -> double
    int intToDouble = (int) d;


  }

}