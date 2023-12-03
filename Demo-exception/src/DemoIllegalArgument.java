public class DemoIllegalArgument {
  
  private int balance;

  public DemoIllegalArgument(int balance) {
    this.balance = balance;
  }

  public DemoIllegalArgument() {

  }

  public static void main(String[] args) {
    DemoIllegalArgument account = new DemoIllegalArgument(1000);
    account.credit(-100); // java.lang.IllegalArgumentException
  }


  public void credit(int amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException();
    }
    this.balance += amount;
  }


}
