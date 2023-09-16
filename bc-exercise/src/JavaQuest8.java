/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here
    secondMax = secondMax(nums);
    System.out.println(secondMax);
    secondMax = secondMax(nums2);
    System.out.println(secondMax);
    secondMax = secondMax(nums3);
    System.out.println(secondMax);
    secondMax = secondMax(nums4);
    System.out.println(secondMax);
  }

  public static int secondMax(int[] arr) {
    int max = -1000;
    int maxidx = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxidx = i;
      }
    }
    int secondMax = -1000;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > secondMax && arr[i] <= max && i != maxidx) {
        secondMax = arr[i];
      }
    }
    return secondMax;
  }

}