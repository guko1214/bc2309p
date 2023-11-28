import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T, U> {
  
  private T data;

  private U value;

  public Box() {

  }

  public Box(T data, U value) {
    this.data = data;
    this.value = value;
  }

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return this.data;
  }

  public void setValue(U value) {
    this.value = value;
  }

  public U getValue() {
    return this.value;
  }

  public static <T, U> Box<T, U> createBox(T data, U value) {
    Box<T, U> box = new Box<T, U>(data, value);
    return box;
  }

  public static void main(String[] args) {

    // Box<String> stringBox = new Box<>();
    // Box<Integer> integerBox = new Box<>();
    // Box<Double> doubleBox = new Box<>();
    // Box<int[]> box = new Box<>(new int[] {10,-100, -4});
    Box<int[], String> box = new Box<>(new int[] {10,-100, -4}, "World");
    Box<String, String> box2 = new Box<>("Hello", "Hello"); 
    
    Box<List<String>, Map<String, String>> box3 = 
    new Box<>(List.of("abc", "abc"), new HashMap<>());
    
    Box<String, Integer> box4 = Box.createBox("Hello", 100);


  }

}
