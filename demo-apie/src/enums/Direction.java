package enums;

public enum Direction {
  
  EAST('E',-2),
  SOUTH('S',-1),
  WEST('W',2),
  NORTH('N',1),
  ;

  private char code;
  private int val;

  private Direction(char code, int val) {
    this.code = code;
    this.val = val;
  }

  public char getCode() {
    return this.code;
  }

  public int getVal() {
    return this.val;
  }

  // 
  public boolean isOpposite(Direction direction) {
    if (this.code == 'S'  && direction.code == 'N')
      return true;
    if (this.code == 'N'  && direction.code == 'S')
      return true;
    if (this.code == 'W'  && direction.code == 'E')
      return true;
    if (this.code == 'E'  && direction.code == 'W')
      return true;      
    return false;
  }

  public boolean isOpposite2(Direction direction) {
    //return (this.val + direction.val) == 0;
    return this.val * -1 == direction.getVal();
  }

  public static void main(String[] args) {
    System.out.println(Direction.SOUTH.isOpposite(Direction.NORTH)); // true
    System.out.println(Direction.SOUTH.isOpposite2(Direction.NORTH)); // true
    System.out.println(Direction.SOUTH.isOpposite2(Direction.SOUTH)); // false
    System.out.println(Direction.EAST.isOpposite2(Direction.SOUTH)); // false
    System.out.println(Direction.EAST.isOpposite2(Direction.WEST)); // true
  }
}
