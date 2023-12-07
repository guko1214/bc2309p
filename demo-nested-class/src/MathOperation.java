public interface MathOperation {
  
  int operate(int x, int y);

  public static void main(String[] args) {
    MathOperation addition = (a,b) -> {
      return a + b;
    };

    System.out.println(addition.operate(3, 1)); // 4

    MathOperation subtract = (a,b) -> {
      return a - b;
    };

    System.out.println(subtract.operate(10, 3)); // 7

  }

}
