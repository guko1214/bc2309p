package enums;

public enum OrderStatus {
  
  ORDERED('O',1),
  PAYED('P',2),
  PRODUCTION('I',3),
  SHIPPED('S',4),
  DELIVERED('D',5),
  CLOSED('C',6),
  ;

  private char code;
  private int statusNum;

  private OrderStatus(char code, int statusNum) {
    this.code = code;
    this.statusNum = statusNum;
  }

  public char getCode() {
    return this.code;
  }

  public int getStatusNum() {
    return this.statusNum;
  }

  // manage status
  // 1. return next status
  // 2. check if the status is forwarded

  public static OrderStatus getOrderStatus(int statusNum) {
    for (OrderStatus status : OrderStatus.values()) {
      if (status.getStatusNum() == statusNum)
        return status;
    }
    return null;
  }

  public OrderStatus nextStatus() {
    int num = this.getStatusNum() < 6 ? this.getStatusNum() + 1 : this.getStatusNum();
    // for (OrderStatus status : OrderStatus.values()) {
      // if (this.statusNum + 1 == status.statusNum) {
      //   return status;
      // }
    // }
    return getOrderStatus(num);
  }

  public boolean isForwardStatus(OrderStatus orderstatus) {
    // if (orderstatus.statusNum > this.getStatusNum())
    //   return true;
    // return false;
    return this.getStatusNum() < orderstatus.getStatusNum();
  }

  public static void main(String[] args) {

    System.out.println(OrderStatus.ORDERED.nextStatus()); // return OrderStatus.ORDERED
    System.out.println(OrderStatus.PAYED.nextStatus()); // return OrderStatus.PAYED
    System.out.println(OrderStatus.PRODUCTION.nextStatus()); // return OrderStatus.PRODUCTION
    System.out.println(OrderStatus.SHIPPED.nextStatus()); // return OrderStatus.SHIPPED
    System.out.println(OrderStatus.DELIVERED.nextStatus()); // return OrderStatus.DELIVERED
    System.out.println(OrderStatus.CLOSED.nextStatus()); // return OrderStatus.CLOSED

    System.out.println(OrderStatus.PAYED.isForwardStatus(OrderStatus.PAYED)); // false
    System.out.println(OrderStatus.PAYED.isForwardStatus(OrderStatus.CLOSED)); // true
    System.out.println(OrderStatus.PRODUCTION.isForwardStatus(OrderStatus.DELIVERED)); // true
    System.out.println(OrderStatus.SHIPPED.isForwardStatus(OrderStatus.PAYED)); // false

  }



}
