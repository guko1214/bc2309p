public class Inventory {
  
  // primitives, wrapper class, String
  Stock[] stocks;

  static String location = "TST";

  static String type = "liquid";

  // Constructor signature 1 (with Stock parameter)
  public Inventory(Stock stock) {
    this.stocks = new Stock[100];
    this.stocks[0] = stock;
    //this.location = loc ation;
  }

  // Constructor signature 2 () (no parameter)
  public Inventory() {
    this.stocks = new Stock[100];
  }



  public void add(Stock stock) {
    for (int i = 0; i < this.stocks.length; i++){
      if (this.stocks[i] == null) {
        this.stocks[i] = stock;
        break;
      }
    }
  }

  // public void setlocation(String location) {
  //   this.location = location;
  // }

  public Stock[] getstock() {
    return this.stocks;
  }

  // method: return no of stock in the stock array
  public int size() {
    int i = 0;
    for (int j =0; j < this.stocks.length; j++) {
      if (this.stocks[j] != null) {
        i++;
      }
    }
    return i;
  }

  // method: print out each stock's price in inventory line to line
  public void printstocksprice() {
    for (int i = 0; i < this.getstock().length; i++) {
      Stock s = this.getstock()[i];
      if (s != null) {
        System.out.println("Stock " + i + ", price=" + s.getprice());
      }
    }
  }

  // method: clear all stocks record in inventory

  public void clearstocks() {
    // for (Stock s : this.getstock()) {
    for (int i = 0; i < this.getstock().length; i++) {
      //s = null;
      this.getstock()[i] = null;
      // System.out.println(s);
    }
  }

  public static void main(String[] args) {
    // new a stock
    // new a inventory
    // how to set stock into an inventory
    
//     Stock stock = new Stock();
//     stock.setprice(345.9d);
//     Inventory inv = new Inventory(stock);
//     //System.out.println(inv.getstock().getprice());

//     Inventory inv2 = new Inventory();
//     inv2.setstock(new Stock());
//     //System.out.println(inv2.getstock().getprice());
    
//     // new a stock with price
//     // new a inventory
//     // how to set stock into an inventory
// ;
//     Stock stock2 = new Stock(9.87d);
//     Inventory inv3 = new Inventory(stock2);
//     System.out.println(inv3.getstock().getprice());

//     Stock stock3 = new Stock();
//     Inventory inv4 = new Inventory(stock3);
//     System.out.println(inv4.getstock().getprice());
//     inv4.stock.setprice(23.8d);
//     System.out.println(inv4.getstock().getprice());

//     Stock stock4 = new Stock();
//     stock4.setprice(78.4d);
//     Inventory inv5 = new Inventory(); //empty constructor
//     inv5.setstock(stock4);
//     System.out.println(inv5.getstock().getprice());
    
//     Inventory inv6 = new Inventory();
//     inv6.setstock(new Stock());

//     // how to print the price of the stock inside the inventory object
//     System.out.println(inv6.getstock());
//     System.out.println(inv6.getstock().getprice());
//     inv6.getstock().setprice(8.43d); // is this only way to alter the inventory's stock's price? 
//     // getstock() then setprice()
//     System.out.println(inv6.getstock().getprice());


    Stock stock = new Stock(99.9d);
    Inventory inventory= new Inventory();
    inventory.add(stock);
    Stock stock2 = new Stock(45.6d);
    inventory.add(stock2);
    Stock stock3 = new Stock(32.4d);
    inventory.add(stock3);
    for (int i = 0; i < inventory.getstock().length; i++) {
      Stock s = inventory.getstock()[i];
      if (s != null) {
        System.out.println("Stock " + i + ", price=" + s.getprice());
      }
    }
    int j = 0;
    for (Stock s : inventory.getstock()) {
      if (s != null) {
        System.out.println("Stock " + j + ", price=" + s.getprice());
      }
      j++;
    }

    inventory.printstocksprice();

    System.out.println(inventory.size());

    for (int k = 0; k < inventory.getstock().length; k++) {
      Stock s = inventory.getstock()[k];
      if (s != null) {
        s.setprice(100);
      }
    }

    Stock stock4 = new Stock();
    inventory.add(stock4);
    System.out.println(inventory.size());

    inventory.printstocksprice();

    System.out.println("no. of stock in inventory=" + inventory.size());

    inventory.clearstocks();

    System.out.println("no. of stock in inventory=" + inventory.size());

    System.out.println(Inventory.location);


  }



}
