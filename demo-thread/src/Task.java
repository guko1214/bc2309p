public class Task implements Runnable {
  @Override
  public void run() {
    int sum = 0;
    for (int i = 0; i < 1; i++) {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {

      }
    }
    System.out.println("Task1 1 is completed");
  }

  public static void main(String[] args) throws Exception {
    Task task = new Task();
    //task.run();

    Task2 task2 = new Task2();
    //task2.run();

    Thread t1 = new Thread(task); // with sleep 5 seconds
    t1.start(); // non-blocking

    Thread t2 = new Thread(task2);
    t2.start(); // create another thread

    System.out.println("main() ends");

  }

}
