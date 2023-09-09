public class DemoArrayLoop {
  public static void main(String[] args) {
    int[] nums = new int[4];
    nums[0] = 100;
    nums[1] = 99;
    nums[2] = 1000;
    nums[3] = 1005;    
    for (int i = 0; i < 4; i++) { // 0, 1, 2, 3
      System.out.println(nums[i]);
    }

    // nums.length -> 4
    for (int i = 0; i < nums.length; i++) { // 0, 1, 2, 3
      System.out.println(nums[i]);
    }

    // sum 
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    System.out.println("The sum of the array 'nums' is " + sum);
  

    // Find the max value in the array
    int max = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println("The maxinum value of; array 'nums' is " + max);

    // Find the min value in the array
    int min = 2147483647;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    System.out.println("The mininum value of array 'nums' is " + min);

    // Find the average of all the values. in the array
    double sum2 = 0.0;
    for (int i = 0; i < nums.length; i++) {
      sum2 += nums[i];
    }
    //double sum3 = sum2;
    double average = sum2 / nums.length;
    System.out.println("The average values of all the values in the array 'nums' is " + average); // 551.0

    // Print odd numbers in the array, from the tail of array
    for (int i = nums.length -1; i >= 0; i--) {
      if (nums[i] % 2 != 0) {
      // if (nums[i] % == 1) {
        System.out.println(nums[i] + " is odd numbers");
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[nums.length - 1 - i] % 2 != 0) {
        System.out.println(nums[nums.length - 1 - i ] + " is odd numbers");
      }
    }

    //
    int[] integers = new int[] {100, 3, 10, 5, -100};
    int target = 10;
    // print index of value 10
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] == target) {
        System.out.println("The index of value 10 is " + i);
      }
    }

    // string method toCharArray() split string to array 
    
    String str = "hello world";
    char[] characters = str.toCharArray();
    // Approach 1
    String newstr = "";
    for (int i = 0; i < characters.length; i++) {
      // System.out.println(characters[i]);
      if (str.charAt(i) == 'o') {
        newstr += 'z';
      } else {
        newstr += str.charAt(i);
      }
    }
    System.out.println(newstr);
    
    // Approach 2
    String str2 = "";
    for (int i = 0; i < characters.length; i++) {
      // System.out.println(characters[i]);
      if (characters[i] == 'o') {
        characters[i] = 'k';
      }
    }
    for (int i = 0; i < characters.length; i++) {
      str2 += characters[i];
    }

    System.out.println(str2);
    // when found 'o', replace it by z
    // print str -> hellz wzrld
    
    // String.valueof(variable)
    System.out.println(String.valueOf(characters)); // char[] -> String

    String u = String.valueOf(1); // 1 -> "1", allow int convert to String
    
    
  }
}