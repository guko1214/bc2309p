public class Testbreak {
  public static void main(String[] args) {
    
    // Step 1: i = 0
    // Step 2: check if i < 10
    // Step 3: check if i > 2
    // Step 4: i++; i -> 1
    // Step 5: check if i < 10
    // Step 6: check if i > ２
    // Step 7: i++; i -> 2
    // Step 8: check if i < 10 
    // Step 9: check if i > 2
    // Step 10: i++; i -> 3
    // Step 11: check if i < 10
    // Step 12: check if i > 2 -> true -> break the loop
    // Step 12: 
    for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6,7,8,9
      if (i > 2) {
        System.out.println(i);
        break;
      }
    }
    // 0, 1, 2, 3
  }
}