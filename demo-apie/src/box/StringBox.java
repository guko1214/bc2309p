package box;

public class StringBox {
  
  private char[] arr; 

  public StringBox(String s) {
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



  public static void main(String[] args) {
    //char[] arr = new char[] {'a','b','c'};
    //StringBox str = new StringBox(arr);
    StringBox stringBox = new StringBox("sample");
    System.out.println(stringBox.length());
    System.out.println(stringBox.charAt(2));

  }

}
