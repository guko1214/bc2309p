public class DemoArray {
  public static void main(String[] args) {
    int i1 = 100;
    int i2 = 105;
    int i3 = 108;

    // array
    int[] array; // declaration
    array = new int[3]; // initialization

    int[] arr = new int[3]; // 0, 1, 2 -> index of the array
    // assign values to array
    // arr[-1] = 99; // error not negaive index
    arr[0] = 100;
    arr[1] = 105;
    arr[2] = 108;
    // arr[3] = 110; run-time error
    
    arr[1] = 106;
    System.out.println(arr[0]); // 100
    System.out.println(arr[1]); // 106
    System.out.println(arr[2]); // 108

    int o = arr[0]; // arr[0] -> int
    System.out.println(o);
    // arr[1] = 3L; // error, cannot assign long value to int variable

    // declare array wiht size 6
    int[] arr2 = new int[6];
    arr2[0] = 102;
    arr2[1] = 123;
    arr2[2] = 110;
    arr2[3] = 109;
    arr2[4] = 121;
    arr2[5] = 99;

    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);
    System.out.println(arr2[3]);
    System.out.println(arr2[4]);
    System.out.println(arr2[5]);

    // declare char array with size 4
    char[] arr3 = new char[4];
    arr3[0] = 'a';
    arr3[1] = 'b';
    arr3[2] = 'd';
    arr3[3] = 'I';
    
    System.out.println(arr3[0]);
    System.out.println(arr3[1]);
    System.out.println(arr3[2]);
    System.out.println(arr3[3]);

    // boolean array with size 5;
    boolean[] arr4 = new boolean[5];
    arr4[0] = true;
    arr4[1] = false;
    arr4[2] = false;
    arr4[3] = true;
    arr4[4] = true;

    System.out.println(arr4[0]);
    System.out.println(arr4[1]);
    System.out.println(arr4[2]);
    System.out.println(arr4[3]);
    System.out.println(arr4[4]);

    int[] arr5 = new int[] {100,99,1005,2000};
    arr5[3] = 3000;
    // arr5[4] = 3000; // index out of bounds, runtime error
    
    arr5 = new int[] {1,2,3,4,5}; // physically new, not the original arr5 in memory
    

  }
}