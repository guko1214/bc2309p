public class App {
    public static void main(String[] args) {
        int[] arr = new int[] {100, 102, 55, 23, 1000};

        // for loop
        for (int i = 0; i < arr.length; i++) { // counter
            System.out.println(arr[i]);
        }

        // for each; suitable for use in array
        // when you don't need to use the index number
        for (int num : arr) {
            System.out.println(num);
        }

        // for each, String[]
        String[] arr2 = new String[] {"apple","banana","carrot", "egg", "fork"};

        for (String str : arr2) {
            System.out.println(str);
        }

        

    }
}
