
import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  private int[] myArray;

  public JavaQuest10 (int[] myArray) {
    this.myArray = myArray;
  }

  public int[] getMyArray() {
    return this.myArray;
  }

  public void replaceNumber(int replaceIdx, int number) {
    int size = this.myArray.length;
    // for (int i = size - 1; i > replaceIdx; i--) {
    //   this.myArray[i] = this.myArray[i - 1];
    // }
    // this.myArray[replaceIdx] = number;
    int temp = this.getMyArray()[replaceIdx];
    this.getMyArray()[replaceIdx] = number;
    int temp2 = this.getMyArray()[replaceIdx + 1];
    for (int i = replaceIdx + 1; i < size; i++) {
      this.getMyArray()[i] = temp;
      temp = temp2;
      if (i < size - 1) 
        temp2 = this.getMyArray()[i + 1];
    }
  } 

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here
    JavaQuest10 myArray = new JavaQuest10(my_array);

    myArray.replaceNumber(indexPosition, newValue);

    System.out.println("New Array: " + Arrays.toString(my_array));
  }


}