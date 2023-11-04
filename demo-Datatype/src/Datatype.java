public class Datatype {
  public static void main(String[] args) {

    // Assign value "Hello World!!!!" to a variable box
    String box = "Hello World!!!"; // Assignment

    System.out.println(box); // Print the value of a variable: Hello World!!!!
    System.out.println("box"); // Print the string value: box

    String str; // Declaration 聲明
    box = "Welcome to Bootcamp"; // Assignment
    str = "*&#bew$#"; // Assign value "abc" to a variable str
    System.out.println(str); // &#bew$#
    System.out.println(box);

    // Primitives, 8 types in total (one kind of data type)
    // int X = "abc"; // Type mismatch: cannot convert from string to int
    int x = 1;
    System.out.println(x);
    int salary = 1000;
    x = 10;
    System.out.println(x); // 10
    System.out.println(salary);

    x = x + 2; 
    // Always look at the right hand side
    // 10 + 2, assign 12 back to variable x
    System.out.println(x); // 12

    x = x - 8;
    System.out.println(x); // 4 (12 - 8), assign back to variabe x

    salary = salary + x;
    System.out.println(salary); // 1004

    int z = salary / 2;
    System.out.println(z); // 502

    int k = z * 5;
    System.out.println(k); // 2510

    int sum = x + salary + z + k; //  4020
    System.out.println(sum);

    int result = sum + 10 / 2; 
    System.out.println(result); // 4025

    // self + 1
    int j = 0;
    j = j + 1; // Approach 1
    j += 1; // same as j = j + 1, "= j +" -> "+="
    j++; // Approach 3
    ++j; // Approach 4
    System.out.println(j); // 4

    // String str = 1; // Not OK, cannot assign int to String variable
    String s = "Hello";
    // s = s / 2; String cannot divide by 2
    // s = s * 2; 
    // s = s -2;
    s = s + " world."; // String supports + operation
    System.out.println(s); // hello world.

    String str1 = "abc";
    String str2 = "xyz";
    String e = str1 + str2;
    System.out.println(e); // abcxyz
    System.out.println("e=" + e); // e;=abcxyz

    // int ->　Integer 整數
    // int a = 0.3; // cannot assign decimal to int variable
    double d = 0.3;
    d = 3.1415;
    System.out.println(d); // 3.1415
    d = d + 0.3 - 0.1 * 2;
    System.out.println(d); // 3.2415

    double d2 = 3; // assign int to variable d2, then convert int to double
    System.out.println(d2); // 3.0

    // boolean (true OR false)
    boolean a = true;
    System.out.println(a); // true
    boolean isLeft = false;
    System.out.println(isLeft); // false
    // String w = true; // cannnot assign true/false to Sting variable
    // boolean doesn't support +/-/*/// operation
    boolean isMale = true;

    // char
    char t = 'a';
    System.out.println(t); // a
    // char i = ''; // at least 1 character
    // char t = 'ab'; // NOT OK, not more than 1 character
    char o = '$';
    System.out.println(o); // $
    
    // byte
    byte b = 1; // Within -128 to 127
    // byte b2 = -129; // out of range
    // byte b3 = 128; // out of range
    // b = b + 10 - 9 * 6 / 2;
    System.out.println(b);

    // short
    short sh = 128;
    // short sh = -40000; // NOT OK, out of range
    // short sh2 = 40000; // NOT OK, out of range
    int r2 = sh + 100; // 228
    System.out.println("r2=" + r2); // re=228

    // long (a type has a bigger range than int)
    long l1 = 10000;
    l1 += 20000; // l1 = l1 + 20000
    System.out.println(l1); // 30000

    l1 -= 5000; // l1 = l1 - 5000
    System.out.println(l1); // 25000

    l1 *= 2; // l1 = l1 * 2
    System.out.println(l1); // 50000

    l1 /= 10; //l1 = l1 / 10;
    System.out.println(l1); // 5000

    // String support +=
    String k2 = "abc";
    k2 += " bcd";
    System.out.println(k2); // abc bcd

    // float
    int i = 1; // By default, java treat 1 is an integer
    double d4 = 3.0; // By default, java treat 3.0 is a double value
    double d5 = 3.0d; // Explicitly assign a double value to a variable
    // float f = 3.0; // NOT OK, assign double value to float variable
    float f = 3.0f; // Explicitly assign a float value to float variable

    // byte, short, int long -> all of them handle Integer
    byte b3 = 3; 
    short s3 = 4;
    int i3 = 5; // default int value
    long i4 = 5; // (upcast), you can ignore today
    long l3 = 5L; // Assign long value 5 to a long variable


  }
}