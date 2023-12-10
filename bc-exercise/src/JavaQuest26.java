/*
* 
* Question : You are given an integer array nums. 
* The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

import java.util.Arrays;

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 2, 3, 2 })); // 4
    System.out.println(sum(new int[] { 1, 1, 1, 1, 1 }));// 0
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5, 6 }));// 21
    System.out.println(sum(new int[] { 1 }));// 1
  }

  public static int sum(int[] nums) {
    // code here
    int max = 0;
    for (int n : nums) {
      if (n > max)
        max = n;
    }
    int[] counts = new int[max + 1];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {     
      ++counts[nums[i]];
      if (counts[nums[i]] == 1) {
        sum += nums[i];
      } else if (counts[nums[i]] == 2) {
        sum -= nums[i];
      }
    }
    //System.out.println(Arrays.toString(counts));
    return sum;
  }
}