import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {

    public static ArrayList<String> al = new ArrayList<>();
    public static Vector<String> vs = new Vector<>();

  public static void main(String[] args) throws InterruptedException{

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000000; i++) {
        al.add("s");
      } 
    });

    Thread t2 = new Thread( () -> {
      for (int i = 0; i < 1000000; i++) {
        al.add("s");
      }
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();


    System.out.println(al.size());

    Thread t3 = new Thread(() -> {
      for (int i = 0; i < 1000000; i++) {
        vs.add("s");
      } 
    });

    Thread t4 = new Thread( () -> {
      for (int i = 0; i < 1000000; i++) {
        vs.add("s");
      }
    });

    t3.start();
    t4.start();

    t3.join();
    t4.join();


    System.out.println(vs.size());    

    // Vector Class implement List
    List<String> strings = new Vector<>(); // Vector is thread-safe
    strings.add("abc");
    strings.add("ijk");
    strings.remove("abc");
    System.out.println(strings.get(0)); // ijk
    strings.remove(0);
    System.out.println(strings.size()); // 0

    Vector<String> ss = new Vector<>();
    ss.add("abc");
    ss.add("ijk");
    ss.removeElementAt(1);
    
    List<String> ss2 = ss;
    //ss2.removeElementAt(1);
    
  }

}
