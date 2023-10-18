package transportation;

public class Taxi implements Movable {
  
  private int speed;

  private Location location;

  public Taxi(int speed) {
    this.speed = speed;
    this.location = new Location();
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

  public Location getLocation() {
    return this.location;
  }

  public boolean isArrivedDestination() {
    return this.location.getX() >= 100;
  }

  @Override
  public Taxi move() {
    // location x, +1 when speed=10, +2 when speed=20
    //int currentX = this.location.getX();
    //this.location.setX(currentX + this.speed / 10);
    int newX = this.location.getX() + this.speed / 10;
    this.location.setX(newX);
    return this;
  }

  @Override
  public void accelerate() {
    this.speed += 30;
  }

  public boolean isWinner() {
    return this.isArrivedDestination();
  }

  public String callWinner() {
    return "Taxi is winner!";
  }

  public static void main(String[] args) {
     
  }


}
