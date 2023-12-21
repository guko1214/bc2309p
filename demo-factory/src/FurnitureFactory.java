public interface FurnitureFactory {
  
  Chair createChair();

  Sofa createSofa();

  public static FurnitureFactory create(Style style) {
    return switch (style) {
      case MODERN -> new ModernFurnitureFactory();
      case VICTORIA -> new VictoriaFurnitureFactory();
    };
  }

  public static void main(String[] args) {

    int age = 50;
    Style style = null;
    if (age > 35) {
      style = Style.VICTORIA;
    } else {
      style = Style.MODERN;
    }
    
    FurnitureFactory ff = FurnitureFactory.create(style);

    int money = 10000;
    if (money > 8000) {
      ff.createSofa(); // during compile time: do we know it is creating modern sofa?
    } else {
      ff.createChair();
    }

    
  }
}
