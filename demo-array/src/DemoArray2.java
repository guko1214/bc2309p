import java.util.Arrays;

public class DemoArray2 {
 public static void main(String[] args) {
  //
  //int[] arr = new int[] {10, 4, 2, 100, -3};
  //int[] arr = new int[] {-10, -4, -2, -100, -3};
  int[] arr = new int[] {109, 499, 2, -100, -223};
  // [-3, 2, 4, 10, 100] -> ascending order sorting
  

  //System.out.println(Arrays.toString(arr));
  System.out.println(Arrays.toString(DemoArray2.sort(arr)));
  System.out.println(Arrays.toString(arr));
  System.out.println(Arrays.toString(DemoArray2.sort2(arr)));
 } 

 public static int[] sort(int[] arr) {
  // // Vicent's solution

  int[] arr2 = new int[arr.length];
  for (int i = 0;i < arr.length; i++) {
    arr2[i] = arr[i];
  }
  int max = Integer.MIN_VALUE;
  int temp = -1;
  int idx = -1;
  for (int i = arr.length - 1; i >= 1; i--) {
    max = Integer.MIN_VALUE;
    for (int j = i; j >= 0; j--) {
      if (arr2[j] > max) {
        max = arr2[j];
        idx = j;
      }
    }
    //swap ...
    if (i != idx) {
      //temp = arr[i];
      //arr[i] = max;
      //arr[idx] = temp;
      temp = arr2[idx];
      arr2[idx] = arr2[i];
      arr2[i] = temp;
    }
  }
  return arr2;
 }

public static int[] sort2(int[] arr) {
  int[] arr2 = new int[arr.length];
  for (int i = 0;i < arr.length; i++) {
    arr2[i] = arr[i];
  }
  int temp;
  //int j = 0;
  for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr2[j] > arr2[j + 1]) {
          temp = arr2[j + 1];
          arr2[j + 1] = arr2[j];
          arr2[j] = temp;
          //System.out.println(Arrays.toString(arr));      
        }
    }
  }
  return arr2;
 }

}
