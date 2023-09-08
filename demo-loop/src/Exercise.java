public class Exercise {
  public static void main(String[] args) {
    
    // sum of 1,2,3,4,5,6,7,8,9,10
    int sum = 0;
    int numberAdd;
    for (int i = 0; i < 10; i++) {
      numberAdd = i + 1;
      System.out.println("The number added to sum is " + numberAdd);
      sum += numberAdd;
    }
    System.out.println("sum is " + sum); // 55
  

    int sum2 = 0;
    for (int i = 0; i < 11; i++) {
      numberAdd = i + 1;
      if (numberAdd <= 10) {
        System.out.println("The number added to sum is " + numberAdd);
        sum2 += numberAdd;
      }
      
    }
    System.out.println("sum2 is " + sum2); // 55
    int sum3 = 0;
    for (int i = 1; i < 11; i++) {
      sum3 += i;
    }
    System.out.println("sum3 is " + sum3);

    // sum of 2,4,6,8,10
    int sum4 = 0;    
    for (int i = 0; i < 11; i += 2) {
      sum4 += i;
    }
    System.out.println("sum4 is " + sum4);

    int sum5 = 0;
    for (int i = 1; i < 11; i++) {
      if (i % 2 == 0) {
        sum5 += i;
      }
    }
    System.out.println("sum5 is " + sum5);

    // 1 - 1000
    // 1 - 299 (add all even number)
    // 200 - 699 (add all odd number)
    // 700 -1000 (add all numbers can be divided by 3)
    int sum6 = 0;
    for (int i = 1; i < 1001; i++) {
      if (i < 300) {
        if (i % 2 == 0){
          sum6 = sum6 + i;
        }
      } else if (i < 700) {
        if (i % 2 == 1) {
          sum6 = sum6 + i;
        }
      } else {
        if (i % 3 == 0) { 
          sum6 = sum6 + i;
        }
      }
    }
    System.out.println("sum6 is " + sum6);

    int sum7 = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i < 300) {
        if (i % 2 == 0) {
          sum7 += i;
        }
      } else if (i < 700) {
        if (i % 2 == 1) {
          sum7 += i;
        }
      } else {
        if (i % 3 == 0) {
          sum7 += i;
        }
      }
    }
    System.out.println("sum7 is " + sum7);

    // 1 - 1000
    // for odd numbers, add itself multipled by 3
    // for even numbers, add all numbers can be divided by 5
    // for other numbers not mentioned above two cases, 
    // add itself if it can be divided by 2, otherwise add itself divided by 2 
    int sum8 = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i % 2 != 0) {
        sum8 += i * 3;
      } else if (i % 2 ==0 && i % 5 == 0) {
        sum8 += i;
      } else {
        if (i % 2 == 0) {
            sum8 += i;
        } else {
          sum8 += i / 2;
        }
      }
    }
    System.out.println("sum8 is " + sum8);
  }  
}