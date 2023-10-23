package transportation;

public class Location {
  // 封裝 outside Bus, Taxi
  
  private int x; // 1 -> 10

  public Location() {
    this.x = 1;
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  // public boolean isArrivedDestination() {
  //   return x >= 100;
  // }

  public static void main(String[] args) {
    // System.out.println("Round 1 with accerelation");
    // Bus bus = new Bus(20);
    // Taxi taxi = new Taxi(20);
    // int noOfRound = 1;
    // int noOfMove = 1;
    // while (bus.getLocation().isArrivedDestination() || taxi.getLocation().isArrivedDestination()) {
    //   bus.move();
    //   taxi.move();
    //   //bus.accelerate();
    //   //taxi.accelerate();
    //   System.out.println("Round " + noOfRound + " Move " + noOfMove);
    //   System.out.println("Bus Location=" + bus.getLocation().getX() + ", speed=" + bus.getSpeed());
    //   System.out.println("Taxi Location=" + taxi.getLocation().getX() + ", speed=" + taxi.getSpeed());
    //   noOfMove++;
    //   if (bus.getLocation().isArrivedDestination())
    //     System.out.println("Bus has arrived destination!");
    //   if (taxi.getLocation().isArrivedDestination())
    //     System.out.println("Taxi has arrived destination!");
    // }
    Bus bus = new Bus(20);
    Taxi taxi = new Taxi(20);
    taxi.accelerate();
    //while (!bus.getLocation().isArrivedDestination()
    //    && !taxi.getLocation().isArrivedDestination()) {
    while (!bus.isArrivedDestination()
        && !taxi.isArrivedDestination()) {      
      //bus.move();
      System.out.println("Bus Location=" + bus.getLocation().getX() + ", speed=" + bus.getSpeed());
      if (bus.move().isWinner()){
        //System.out.println(bus.callWinner());
        //bus.printWinner("Bus");
        Movable.staticPrintWinner("Bus");
        break;
      }
      //taxi.move();
      System.out.println("taxi Location=" + taxi.getLocation().getX() + ", speed=" + taxi.getSpeed());
      if (taxi.move().isWinner()) {
        //System.out.println(taxi.callWinner());
        // bus.printWinner("Taxi");
        Movable.staticPrintWinner("Taxi");
        break;
      }
    }

    // noOfRound++;
    // bus = new Bus(20);
    // taxi = new Taxi(20); 
    // noOfMove = 1;
    //   while (bus.getLocation().isArrivedDestination() || taxi.getLocation().isArrivedDestination()) {
    //   bus.move();
    //   taxi.move();
    //   bus.accelerate();
    //   taxi.accelerate();
    //   System.out.println("Round " + noOfRound + " Move " + noOfMove);
    //   System.out.println("Bus Location=" + bus.getLocation().getX() + ", speed=" + bus.getSpeed());
    //   System.out.println("Taxi Location=" + taxi.getLocation().getX() + ", speed=" + taxi.getSpeed());
    //   noOfMove++;
    //   if (bus.getLocation().isArrivedDestination())
    //     System.out.println("Bus has arrived destination!");
    //   if (taxi.getLocation().isArrivedDestination())
    //     System.out.println("Taxi has arrived destination!");
    // }
  }

}
