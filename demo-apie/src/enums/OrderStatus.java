package enums;

public enum OrderStatus {
  
  ORDERED('O',0),
  PAYED('P',1),
  PRODUCTION('T',2),
  DELIVERED('D',3),
  CLOSED('C',4),
  ;

  private char code;
  private int statusNum;

  private OrderStatus(char code, int statusNum) {
    this.code = code;
    this.statusNum = statusNum;
  }

  // manage status
  // 1. return next status
  // 2. check if the status is forwarded
  public OrderStatus nextStatus() {
    for (OrderStatus status : OrderStatus.values()) {
      if (status.statusNum == this.statusNum + 1) {
        return status;
      }
    }
    return this;
  }
  
  public boolean isForward(OrderStatus orderstatus) {
    if (orderstatus.statusNum - this.statusNum == 1)
      return true;
    return false;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.ORDERED.nextStatus());
    System.out.println(OrderStatus.PAYED.nextStatus());
    System.out.println(OrderStatus.ORDERED.isForward(OrderStatus.PAYED));
    System.out.println(OrderStatus.ORDERED.isForward(OrderStatus.CLOSED));
  }



}
