public class Computer {
  
  String type; // desktop or laptop

  String cpu;

  int memorySize;

  int resolutionWidth;

  int resolutionHeight;

  String monitorType; // non-touch mon or touch mon

  int inputCurrent;

  int inputVoltage;

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getCpu() {
    return this.cpu;
  }

  public void setmemorySize(int size) {
    this.memorySize = size;
  }

  public int getmemorySize() {
    return this.memorySize;
  }

  public void setresolutionWidth(int width) {
    this.resolutionWidth = width;
  }

  public int getresolutionWidth() {
    return this.resolutionWidth;
  }

  public void setresolutionHeigth(int heigth) {
    this.resolutionHeight = heigth;
  }

  public int getresolutionHeight() {
    return this.resolutionHeight;
  }

  public void setmonitorType(String type) {
    this.monitorType = type;
  }

  public String getmonitorType() {
    return this.monitorType;
  }

  public void setinputCurrent(int current) {
    this.inputCurrent = current;
  }

  public int getinputCurrent() {
    return this.inputCurrent;
  }

  public void setinputVoltage(int voltage) {
    this.inputVoltage = voltage;
  }

  public int getinputVoltage() {
    return this.inputVoltage;
  }

  public String getResolution() {
    return this.resolutionHeight + "x" + this.resolutionWidth; 
  }

  public boolean isTorchMon() {
    if (this.monitorType == "touch mon")
      return true;
    return false;
  }

  public int getinputPower() {
    return this.inputCurrent * this.inputVoltage;
  }

  public String getDescription() {
    String des;
    // des = "This is a " + this.type + " with "  + this.cpu + " cpu and ";
    // des += this.memorySize + "GB ram. The monitor has ";
    // des += this.getResolution() + " resolution";
    des = "This is a " + this.type + " with "  + this.cpu + " cpu and "
      + this.memorySize + "GB ram. The monitor has "
      + this.getResolution() + " resolution";
    if (this.isTorchMon()) {
      des += " with touch screen.";
    } else {
      des += ".";
    }
    return des;
  }

  public static void main(String[] args) {
    Computer com1 = new Computer();
    com1.setType("laptop");
    com1.setCpu("i5 12450p");
    com1.setmemorySize(16);
    com1.setresolutionWidth(2560);
    com1.setresolutionHeigth(1440);
    com1.setmonitorType("touch mon");
    com1.setinputCurrent(3);
    com1.setinputVoltage(18);
    System.out.println(com1.getDescription());
  }

}
