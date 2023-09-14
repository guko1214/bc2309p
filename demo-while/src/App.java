public class App {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // sum: 1 - 10
        int k = 1;
        int sum = 0;
        while (k <= 10) {
            sum += k;
            k++;
        }
        System.out.println("sum=" + sum);
        
        // sum: even number 1 - 10
        int l = 0;
        int sum2 = 0;
        while (++l < 11) { // can use ++ in condition, ++l: l + 1 before check condition, l++: l + 1 after check condition
            if (l % 2 == 0) {
                sum2 += l;
            }
        }
        System.out.println("sum2=" + sum2);

        // do-while, run at least one time the code
        int count = 0;
        do {
            System.out.println("count=" + count);
        } while(++count  < 5);

        // break
        // 1 - 10, when odd number and > 6, print the number
        // int m = 0;
        // while (++m < 11) {
        //     System.out.println(m);
        //     if (m % 2 != 0 && m > 6) {
        //         break;
        //     }
        // }

        int s = 10;
        while (s > 6) {
            if (s % 2 == 1) {
                System.out.println(s);
            }
            s--;
        }

        System.out.println("===================");

        int n = 10;
        while (true) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
            if (--n <= 6) {
                break;
            }
        }

        


    }
}