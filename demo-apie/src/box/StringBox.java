package box;

public class StringBox {
  
  private char[] arr; // encapsulation of a char array, cannot access from outside

  public static StringBox valueOf(String s) {
    return new StringBox(s);
  }

  private StringBox(String s) {
    this.arr = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      this.arr[i] = s.charAt(i);
    }
  }

  // public StringBox(char[] arr) {
  //   this.arr = arr;
  // }

  public int length() {
    return this.arr.length;
  }
  
  public char charAt(int index) {
    return this.arr[index];
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
  }

}
