import java.math.BigDecimal;
import java.util.ArrayList;

public class Customer {
  
  private String name;

  private ArrayList<Order> orders;

  public Customer(String name) {
    this.name = name;
    this.orders = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }
  
  public boolean add(Order order) {
    return this.orders.add(order);
  }

  public double totalOrderAmount() {
    BigDecimal total = BigDecimal.valueOf(0);
    for (Order order : this.orders) {
      total = total.add(BigDecimal.valueOf(order.total()));
    }
    return total.doubleValue();
  }

  public boolean isVip() {
    // >= 2 order && order total >50
    if (this.orders.size() >= 2 && this.totalOrderAmount() > 50)
      return true;
    return false;
  }

  public static void main(String[] args) {
    OrderItem item1 = new OrderItem(3, 3.4);
    OrderItem item2 = new OrderItem(9, 1.5);
    //OrderItem item3 = new OrderItem(5, 3.89d);
    System.out.println("item1 total=" + item1.total());
    System.out.println("item1 quantity=" + item1.getQuantity());
    System.out.println("item1 unit price=" + item1.getUnitPrice());
    Order order = new Order();
    System.out.println(order.add(item1));
    System.out.println(order.add(item2));
    //System.out.println(order.addOrderItem(item3));
    System.out.println("order total=" + order.total());
    //System.out.println(order.add(new OrderItem(1, 3.4)));
    System.out.println("order total=" + order.total());
    System.out.println("order's order no.=" + order.getOrderNo());
    
    Customer customer = new Customer("John");
    customer.add(order);
    System.out.println("John's total order amount" + customer.totalOrderAmount()); // 23.7
    System.out.println(customer.isVip()); // false

    Order order2 = new Order();
    order2.add(new OrderItem(5, 3.4));
    order2.add(new OrderItem(10, 1.5));
    customer.add(order2);
    System.out.println(customer.totalOrderAmount()); // 55.7
    System.out.println(customer.isVip()); // true
    


  }

}
