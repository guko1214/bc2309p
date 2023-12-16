import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {
  
  private static int counter = 0;

  private static AtomicInteger atomicCounter = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(() -> {
      System.out.println("t1 starts.");
      for (int i = 0; i < 1000000; i++) {
        counter++;
      }
      System.out.println("t1 ends.");
    });
    t1.start(); 

    Thread t2 = new Thread(() -> {
      System.out.println("t2 starts.");
      for (int i = 0; i < 1000000; i++) {
        counter++;
      }
      System.out.println("t2 ends.");
    });
    t2.start();

    t1.join();
    t2.join();
    
    System.out.println("counter=" + counter);
    System.out.println("main() ends.");

    Thread t3 = new Thread(() -> {
      System.out.println("t3 starts.");
      for (int i = 0; i < 1000000; i++) {
        atomicCounter.incrementAndGet(); // similar to counter++
      }
      System.out.println("t3 ends.");
    });
    t3.start(); 

    Thread t4 = new Thread(() -> {
      System.out.println("t4 starts.");
      for (int i = 0; i < 1000000; i++) {
        atomicCounter.incrementAndGet();
      }
      System.out.println("t4 ends.");
    });   
    t4.start(); 

    t3.join();
    t4.join();
    System.out.println("atomicCounter=" + atomicCounter);
  }

}
