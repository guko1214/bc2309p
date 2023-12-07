public class DividedByNegativeException extends RuntimeException {
  
  private int code;

  public DividedByNegativeException() {
    super(ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getErrMsg());
    this.code = ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getCode();
  }


  public static void main(String[] args) {
    int balance = -4;
    int result = 0;
    if (balance < 0) {
      result = 0;
    } else {
      result = 10 / balance;
    }
    // below exception should avoid, use above if case
    // try {
    //   result = 10 / balance;
    // } catch (DividedByNegativeException e) {
    //   result = 0;
    // }
    calculate(-4);

  }

  public static int calculate(int balance) throws DividedByNegativeException {
    if (balance < 0)
      throw new DividedByNegativeException();
    return 10 / balance;
  }

}
