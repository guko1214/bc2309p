package box;

public class StringBox implements CharSequence {
  
  private char[] arr; // encapsulation of a char array, cannot access from outside

  private StringBox(String s) {
    this.arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      this.arr[i] = s.charAt(i);
    }
  }

  private StringBox(char[] arr) {
    this.arr = arr;
  }

  public static StringBox valueOf(String s) {
    return new StringBox(s);
  } 

  public static void check() {
    System.out.println("check");
  }

  @Override
  public int length() {
    return this.arr.length;
  }

  @Override  
  public char charAt(int index) {
    return this.arr[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    //
    if (start == end)
      return "";
    if (end < start)
      return new StringBox(this.arr); 
    char[] newArr = new char[end - start];
    for (int i = start; i < end; i++) {
      newArr[i - start] = this.arr[i];
    }
    return new StringBox(newArr);
  }

  public StringBox substring(int fromIndex, int toIndex) {
    //String str = "";
    StringBuilder str = new StringBuilder("");
    for (int i = fromIndex; i < toIndex; i++) {
      //str += this.arr[i];
      str.append(this.arr[i]);
    }
    //return this.arr;
    //return str.toString();
    // str (StringBuilder) -> StringBox
    return new StringBox(str.toString()); // return new object, not alter the old object
  }

  @Override
  public String toString() {
    return String.valueOf(this.arr);
  }

  public StringBox append(String s) { // important to consider which object is alter
    //return new StringBox(this.toString() + s); // return new object, not alter the original object
    int pos = 0;
    char[] newArr = new char[this.length() + s.length()];
    for (int i = 0; i < this.arr.length; i++) {
      newArr[i] = this.arr[i];
      pos = i;
    }
    for (int i = 0; i < s.length(); i++) {
      newArr[++pos] = s.charAt(i);
    }
    // this.arr (object reference -> char[] "sample")
    // newArr (object reference -> char[] "samplesample")
    this.arr = newArr; // alter the original object
    return this; // return the original modified object
  }


  public static void main(String[] args) {
    //char[] arr = new char[] {'a','b','c'};
    //StringBox str = new StringBox(arr);
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length()); // 6
    System.out.println(stringBox.charAt(2)); // m
    System.out.println(stringBox);// sample
    System.out.println(stringBox.substring(1, 3)); // am
    StringBox stringBox2 = stringBox.substring(1, 3); // create new object
    System.out.println(stringBox2);
    stringBox.append("sample"); // add "sample" at the end of "sample", alter the original object
    System.out.println(stringBox); // samplesample
    StringBox stringbox3 = StringBox.valueOf("Hello world");
    StringBox stringbox4 = stringbox3.substring(2,4); // create new object
    System.out.println(stringbox3); // Hello world
    System.out.println(stringbox4); // ll
    stringbox4.append("!!!!!"); // alter the original object
    System.out.println(stringbox4); // ll!!!!!


    // System.out.println("hello".substring(3,2));
    System.out.println(stringBox.subSequence(1,3));

    CharSequence str = "hello world"; // String implements CharSequece interface in Java, so CharSequence can declared with String
    str = new StringBox("c"); // Your design class "StringBox" implements CharSequence interface, so CharSequence can assign to StringBox
    System.out.println(str.length()); // 11
    System.out.println(str.toString()); // hello world

    String str2 = "abcd";
    System.out.println(str2.length()); // 4
    System.out.println(str2.toString()); // abcd 
    
    // if you call static with object, it will call the parent class static method but not child class static method

  }


}
