public class TestNestedLoop {
  public static void main(String[] args) {
    
    for (int i = 0; i < 5; i++) { // i
      for (int j = 0; j < 5; j++) { // j
        System.out.println("i=" + i + ", j=" + j); // 5 * 5
      } // j
    } // i

    
    // when i = 0,
    // Enter Another Loop (j Counter)
    // i = 0, j = 0, print i -> 0
    // j++
    // i = 0, j = 1, print i -> 0
    // j++
    // i = 0, j = 2, print i -> 0
    // j++
    // i = 0, j = 3, print i -> 0
    // j++
    // i = 0, j = 4, print i -> 0
    // j Counter Loop End
    // i++
    // Enter Another Loop (j Counter)
    // i = 1, j = 0, print i -> 1
    // j ++
    // i = 1, j = 1, print i -> 1
    // j++
    // i = 1, j = 2, print i -> 1
    // j++
    // i = 1, j = 3, print i -> 1
    // j++
    // i = 1, j = 4, print i -> 1
    // j counter Loop End
    // i++
    // Enter Another Loop (j Counter)
    // i = 2, j = 0, print i -> 2
    // j++
    // i = 2, j = 1, print i -> 2
    // j++
    // i = 2, j = 2, print i -> 2
    // j++
    // i = 2, j = 3, print i -> 2
    // j++
    // i = 2, j = 4, print i -> 2
    // j counter Loop End
    // i++
    // Enter Another Loop (j Counter)
    // i = 3, j = 0, print i -> 3
    // j++
    // i = 3, j = 1, print i -> 3
    // j++
    // i = 3, j = 2, print i -> 3
    // j++
    // i = 3, j = 3, print i -> 3
    // j++
    // i = 3, j = 4, print i -> 3
    // j counter Loop End
    // i ++
    // Enter Another Loop (j Counter)
    // i = 4, j = 0, print i -> 4
    // j++
    // i = 4, j = 1, print i -> 4
    // j++
    // i = 4, j = 2, print i -> 4
    // j++
    // i = 4, j = 3, prnit i -> 4
    // j++
    // i = 4, j = 4, print i -> 4
    // j counter Loop End
    // i counter Loop End


    System.out.println("========");
    // i -> 1-10
    // j -> 11-20
    // Print the statement, when i & j are both even number
    for (int i = 1; i <= 10; i++) {
      for (int j= 11; j <= 20; j++) {
        if (i % 2 == 0 && j % 2 == 0) {
          System.out.println("i=" + i + ", j=" + j);
        }
      }
    }

    System.out.println("========");
    // i -> 1-10
    // j -> 11-20
    // Print the statement, when i & j are both even number
    // One more condition: j < 15
    for (int i = 1; i <= 10; i++) {
      for (int j= 11; j <= 20; j++) {
        if (i % 2 == 0 && j % 2 == 0 && j < 15) {
          System.out.println("i=" + i + ", j=" + j);
        }
      }
    }

    System.out.println("========");
    // i -> 1-10
    // j -> 11-20
    // Print the statement, when i & j are both even number
    // One more condition: j < 15
    // Approach 1 // 
    for (int i = 1; i <= 10; i++) { 
      for (int j= 11; j <= 20; j++) {
        if (j >= 15) {
          break; // break the nested loop
          // This approach is fastest, the j loop break when j is 16, no j -> 16, 17, 18, 19, 20, only 15 loop and j++ in 16
        }
        if (i % 2 == 0 && j % 2 == 0) {          
            System.out.println("i=" + i + ", j=" + j);                    
        }
      }
    }  
    // Approach 2
    for (int i = 1; i <= 10; i++) { // outer loop
      for (int j= 11; j <= 20; j++) { // inner loop
        // if (i % 2 == 0 && j % 2 == 0 && j < 15) {
        if (j < 15 && i % 2 == 0 && j % 2 == 0) { // if j < 15 written first, the remaining conditional will not run; thus faster          
          // This approach is slower, since j loop through the end
            System.out.println("i=" + i + ", j=" + j);                    
        }        
      }
    }


    
  }
}