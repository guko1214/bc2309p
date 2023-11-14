import java.math.BigDecimal;

public class OrderItem {
  
  private int quantity;

  private double unitPrice;

  public OrderItem(int quantity, double unitPrice) {
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  } 

  public int getQuantity() {
    return this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }

  public BigDecimal total() {
    return BigDecimal.valueOf(this.quantity) // 
      .multiply(BigDecimal.valueOf(this.unitPrice)); //
      // .doubleValue();
  }

}
