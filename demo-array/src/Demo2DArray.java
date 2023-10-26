public class Demo2DArray {

  public static void print2dArray(int[][] arr2d) {
    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        //System.out.print(j < (arr2d[i].length - 1) ? arr2d[i][j] + "," : arr2d[i][j]);
          //arrString += arr2d[i][j];
        if (j == arr2d[i].length - 1) {
          System.out.print(arr2d[i][j]);
        } else {
          System.out.print(arr2d[i][j] + ",");
        }
      }
      System.out.println("");
    }
  }

  public static void print1dArray(int[] arr1d) {
    for (int i = 0; i < arr1d.length; i++) {
        //System.out.print(j < (arr2d[i].length - 1) ? arr2d[i][j] + "," : arr2d[i][j]);
          //arrString += arr2d[i][j];
        if (i == arr1d.length - 1) {
          System.out.print(arr1d[i]);
        } else {
          System.out.print(arr1d[i] + ",");
        }
      }
      System.out.println("");
  }

  public static void print1dArray(Object[] arr1d) {
    //arr1d.getClass() arr1d2 = (arr1d.getClass()) arr1d;


    for (int i = 0; i < arr1d.length; i++) {
        //System.out.print(j < (arr2d[i].length - 1) ? arr2d[i][j] + "," : arr2d[i][j]);
          //arrString += arr2d[i][j];
        if (i == arr1d.length - 1) {
          System.out.print(arr1d[i]);
        } else {
          System.out.print(arr1d[i] + ",");
        }
      }
      System.out.println("");
  }  

  public static void print1dArray(String[] arr1d) {
    //System.out.println(arr1d.getClass());
    for (int i = 0; i < arr1d.length; i++) {
        //System.out.print(j < (arr2d[i].length - 1) ? arr2d[i][j] + "," : arr2d[i][j]);
          //arrString += arr2d[i][j];
        if (i == arr1d.length - 1) {
          System.out.print(arr1d[i]);
        } else {
          //System.out.print(arr1d[i] + " ");
          System.out.print(arr1d[i] + ",");
        }
      }
      System.out.println("");
  }

  public static void main(String[] args) {
    // 1D array, [1, 3, 10]    
    int[] intArray = new int[] {1,2,5,7,3,0};
    int[] arr = new int[10];
    int[] arr3 = {1,10,3}; // not recommend

    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }

    // 2D int arrays
    // 1, 3, 10
    // 2, 4, 6
    // 11, 13, 17
    // declare 2D array
    int[][] arr2d = new int[3][3];
    int[][] arr2d2 = new int[][]{{1, 3, 10}, {2, 4, 6}, {11, 13, 17}};
    int[][] arr2d3 = {{1, 3, 10}, {2, 4, 6}, {11, 13, 17}};

    // i -> row
    for (int j = 0; j < arr2d2.length; j++) {
      // j -> col
      for (int k = 0; k < arr2d2[j].length; k++) {
        System.out.println("j=" + j + ",k=" + k + ", val=" + arr2d2[j][k]);
      }
    }

    for (int[] row : arr2d2) {
      for (int col : row) {
        System.out.println(col);
      }
    }

    System.out.println(arr2d.length);

    int l = 1;
    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        arr2d[i][j] = l;
        l += 2;
        //arr2d[i][j] = i * 4 +  j * 2 + 1; 
      }
    }

    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        System.out.println(arr2d[i][j]);
      }
    }

    // print array -> static
    print2dArray(arr2d);

    // assign 2, 4, 6, 8, 10 ... (even number) to even2d
    int[][] even2d = new int[3][3];
    int m = 2;
    for (int i = 0; i < even2d.length; i++) {
      for (int j = 0; j < even2d[i].length; j++) {
        even2d[i][j] = m;
        m += 2;
      }
    }
    print2dArray(even2d);

    // product of arr2d and even2d (i.e. 1x2, 3x4, 5x6 ...)
    // assumption arr2d.length == even2d.length, arr2d[0].length == even2d[0].length
    // output result to another array
    int[][] result2d = new int[arr2d.length][arr2d[0].length];
    for (int i = 0; i < even2d.length; i++) {
      for (int j = 0; j < even2d[i].length; j++) {
        result2d[i][j] = arr2d[i][j] * even2d[i][j];
      }
    }
    print2dArray(result2d);

    int[][][] arr4 = new int[2][2][2]; // 3D array, seldom used in commerical (e.g bank...), more in gaming

    // arr2d (3 x 3)
    // 1, 3, 5
    // 7, 9, 11
    // 13, 15, 17
    // convert arr2d to 1d array (1+7+13, 3+9+15, 5+11+17)
    int[] result1d = new int[arr2d[0].length];
    for (int i = 0; i < arr2d[0].length; i++) {
      for (int j = 0; j < arr2d.length; j++) {
        result1d[i] += arr2d[j][i];
      }
    }
      
    // for (int i = 0; i < result1d.length; i++) {

    //   System.out.print(result1d[i] + ",");
    // }
    // System.out.println("");
    print1dArray(result1d);

    int[][] result1d2 = new int[1][arr2d[0].length];
    for (int j = 0; j < arr2d[0].length; j++) {
      for (int i = 0; i < arr2d.length; i++) {
        result1d2[0][j] += arr2d[i][j];
      }
    }

    print2dArray(result1d2);


    char[][] arr9 = new char[][] {{'h', 'e', 'l', 'l','o'},{'j','o','h','n'}};
    String[] str = new String[arr9.length];
    for (int i = 0; i < arr9.length; i++) {
      str[i] = "";
      for (int j = 0; j < arr9[i].length; j++) {
        str[i] += arr9[i][j];
      }
    }

    print1dArray(str);
    // for (int i = 0; i < str.length; i++) {
    //   System.out.println(str[i]);
    // }



  }

}
