public class Task2 implements Runnable {
  
  @Override
  public void run() {
    for (int i = 0; i < 1; i++) {
      try {
        Thread.sleep(500); // 0.5 second
      } catch (InterruptedException e) {

      }
    }
    System.out.println("Task1 2 is completed");
  }
  
}
