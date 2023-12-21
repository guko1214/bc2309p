public class VictoriaFurnitureFactory implements FurnitureFactory {
  
  @Override
  public Chair createChair() {
    return new VictoriaChair();
  }

  @Override
  public Sofa createSofa() {
    return new VictoriaSofa();
  }


}
