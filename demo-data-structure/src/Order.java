import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {
  
  public static int counter = 0;

  private int orderNo;

  private ArrayList<OrderItem> orderItems;

  public Order() {
    this.orderNo = ++counter;
    this.orderItems = new ArrayList<>();
  }

  // public Order(String orderNo, ArrayList<OrderItem> orderItems) {
  //   this.orderNo = ++counter;
  //   this.orderItems = orderItems;
  // }

  public int getOrderNo() {
    return this.orderNo;
  }

  @Override
  public String toString() {
    return "Order(orderNo=" + this.orderNo + ", orderItems=" + this.orderItems + ")";
  }

  public boolean add(OrderItem orderItem) {
    return this.orderItems.add(orderItem);
  }

  public double total() {
    BigDecimal total = BigDecimal.valueOf(0);
    // for (OrderItem item : this.orderItems) {
    for (OrderItem item : this.orderItems) {
      //total = total.add(BigDecimal.valueOf(item.total()));
      total = total.add(item.total());
    }
    return total.doubleValue();
  }





}
