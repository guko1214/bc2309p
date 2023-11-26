import java.util.HashMap;
import java.util.Map;

/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
    public int year;
    public String model;
  // Constructor with variables carYear and carModel
  public JavaQuest19(int year, String model) {
    this.year = year;
    this.model = model;
  }

  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    // Create an instance of class Exercise12, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    Map<Integer, String> hmap = new HashMap<>();
    hmap.put(2020,"ModelY");
    for (Map.Entry<Integer, String> car : hmap.entrySet()) {
        System.out.println("Car Year=" + car.getKey() + ", Car Model=" + car.getValue());
    }

  }
}
