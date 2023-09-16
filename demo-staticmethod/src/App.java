public class App {
    public static void main(String[] args) { // static method, JVM -> static method
        
        int x = 2;
        int y = 5;
        for (int i = 0; i < 10; i++) {
            x *= 2 * y;
            System.out.println(x);
        }
        System.out.println(x);

        x = 10;
        for (int i = 0; i < 10; i++) {
            x *= 2 * y;
        }
        System.out.println(x); 

        int result = add(2,3);
        System.out.println("result=" + result); // 5
        result = add(10, 1000);
        System.out.println("result=" + result); // 1010
        result = add(101, 1000);
        System.out.println("result=" + result); // 1101

        result = sum(5, 8);
        System.out.println("result=" + result);
        result = sum(0, 1000);
        System.out.println("result=" + result);
        result = sum(3, 90);
        System.out.println("result=" + result);
        result = sum(2, 809);
        System.out.println("result=" + result);

    }

    // 1st int -> return type
    // add　-> method name
    // (int x, int y) -> parameters
    public static int add(int x, int y) { // x = 2, y = 3
        int result = x + y;
        return result;
    }

    // sum all values from min to max
    // min = 5, max = 8, sum = 26
    public static int sum(int min, int max) { 
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }




}