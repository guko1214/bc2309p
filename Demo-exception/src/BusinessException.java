public class BusinessException extends Exception { // Checked Exception
  
  private int code;

  public BusinessException() {
    super();
  }

  // public BusinessException(String message) {
  //   super(message);
  // }


  //public BusinessException(String message, int code) {
    // this.message = message;
    // this.code = code;
  //}
  public BusinessException(ErrCode errCode) {
    // super(message);
    super(errCode.errMsg());
    this.code = errCode.code();
  }

  public int getCode() {
    return this.code;
  }

  public String getMessage() {
    return super.getMessage();
  }

  public static void main(String[] args) {
    //BusinessException bussEx = new BusinessException("checking",87);
    System.out.println(ErrCode.NAME_TOO_LONG_EXCEPTION.errMsg());
    // enum can be view as class design in complie time
    BusinessException bussEx = new BusinessException(ErrCode.NAME_TOO_LONG_EXCEPTION); 
    System.out.println(bussEx.getMessage());
  }


}
