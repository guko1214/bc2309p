public class BusinessException extends Exception { // Checked Exception
  
  private int code;

  // public BusinessException() {
  //   super();
  // }

  // public BusinessException(String message) {
  //   super(message);
  // }


  //public BusinessException(String message, int code) {
    // this.message = message;
    // this.code = code;
  //}
  public BusinessException(ErrCode errCode) { // use enums to restrict message available to use
    // super(message);
    super(errCode.getErrMsg());
    this.code = errCode.getCode();
  }

  public int getCode() {
    return this.code;
  }


  public String getMessage() {
    return super.getMessage();
  }

  public String getFullMessage() {
    return String.valueOf(this.code).concat("-").concat(super.getMessage());
  }


  public static void main(String[] args) {
    //BusinessException bussEx = new BusinessException("checking",87);
    System.out.println(ErrCode.NAME_TOO_LONG_EXCEPTION.getErrMsg());
    // enum can be view as class design in complie time
    BusinessException bussEx = new BusinessException(ErrCode.NAME_TOO_LONG_EXCEPTION); 
    System.out.println(bussEx.getMessage());
  }


}
