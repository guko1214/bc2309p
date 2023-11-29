
/*
 * Sum up to Zero
 */

import java.util.Arrays;
import java.util.Random;

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
  }

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique
  public static int[] sumToZero(int i) {
    int[] integers = new int[i];
    Random random = new Random();
    //int intPositiveLimit = 2147483647;
    //int intNegativeLimit = -2147483648;
    int intPositiveLimit = 9;
    int intNegativeLimit = -9;
    int tempSum = 0;
    int sum = 0;    
    boolean unique = true;
    //for (int j = 0; j < i - 1; j++) {
    for (int j = 0; j < 1; j++) {
        integers[j] = random.nextInt(18) - 9;
        tempSum += integers[j];
        sum = tempSum;
    }    
    int k = 1;
    while (k < i - 1) {
      tempSum = sum;
      integers[k] = random.nextInt(18) - 9;
      tempSum = tempSum + integers[k];
      unique = true;
      for (int l = 0; l <= k; l++) {
        if (integers[l] == integers[k]) {
          unique = false;
        }
      }
      if (unique = true) {
        if (tempSum <= intPositiveLimit && tempSum >= intNegativeLimit) {
        sum = tempSum;
        k++;
      }
      }
    }
    while (k < i && tempSum != 0) {
      tempSum = sum;
      integers[k] = random.nextInt(18) - 9;
      tempSum = tempSum + integers[k];      
    }
    System.out.println(Arrays.toString(integers));
    
    return integers;
  }
}