public class Square {

  //public static int area(int length) {
  public static short area(int length) {
  //  return length * length; // int * int -> int
    // return (short) length * length; // short * int -> int
    return(short) (length * length); // int * int -> int -> (short) -> short
    // return a variable, which type should match the method return
  }


  // Practice: Try to design 2 method A & B.
  // You have call method A, and the method A will reply on Method B for call
  // main() -> Method A -> Method B

  public static int area2(int length) {
    return length * length;
  }

  //public static int area3(int length) {
  public static double area3(int length) { // 2 * 2 -> 4.0
    //return (int) Math.pow(length, 2);
    return Math.pow(length, 2);
  }

  public static int profit(int length) {
    return length * length / (10 * 4) - length;
  }


  public static int max(int[] arr) {
    int max = -1;
    for (int v : arr){
      if (v > max) {
        max = v;
    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] > max) {
    //     max = arr[i];
        //max = Math.max(arr[i],max);
      }
    }
    return max;
  }

  


  public static void main(String[] args) {
    int length = 10;
    System.out.println(length * length); // 100
    System.out.println(area2(10)); // 100
    System.out.println(Square.area2(7)); // 49

    int x = 10;
    int area = -1;
    if (x > 8) {
      area = Square.area2(x);
    } else {
      area = (int) Square.area3(x);
    }

    int[] integers = new int[] {10,23,87,35,29};
    //int max = Square.max(integers);
    //System.out.println(max);
    //System.out.println(Square.max(integers));
    System.out.println(Square.max(new int[] {10,23,87,35,29})); // 87

  } 
}
