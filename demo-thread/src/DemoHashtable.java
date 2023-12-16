import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashtable {

  public static HashMap<Integer, Integer> hm = new HashMap<>();
  public static Hashtable<Integer, Integer> ht = new Hashtable<>();
  

  public static void main(String[] args) throws InterruptedException {
    // Hashmap (non tread-safe)
    // Hashtable (Thread-safe)
    // Thread t1 = new Thread(() -> {
    //   for (int i = 0; i < 100000; i++) {
    //     hm.put(i,i);
    //   } 
    // });

    // Thread t2 = new Thread( () -> {
    //   for (int i = 100000; i < 200000; i++) {
    //     hm.put(i,i);
    //   }
    // });

    // t1.start();
    // t2.start();

    // t1.join();
    // t2.join();

    
    // System.out.println("min idx=" + hm.keySet().stream().min(Integer::compareTo).get());
    // System.out.println("max idx=" + hm.keySet().stream().max(Integer::compareTo).get());
    // System.out.println(hm.size());
    // //Comparator<Integer> compare = Integer.compareTo();

    // Thread t3 = new Thread(() -> {
    //   for (int i = 0; i < 100000; i++) {
    //     ht.put(i,i);
    //   } 
    // });

    // Thread t4 = new Thread( () -> {
    //   for (int i = 100000; i < 200000; i++) {
    //     ht.put(i,i);
    //   }
    // });

    // t3.start();
    // t4.start();

    // t3.join();
    // t4.join();

    // System.out.println(ht.size());    

      HashMap<Integer, String> map = new HashMap<>();
      Hashtable<Integer, String> table = new Hashtable<>();

      Runnable mapPut = () -> {
        for (int i = 0; i < 100; i++) {
          map.put(i,String.valueOf(i));
        }
      };

      Thread t1 = new Thread(mapPut);
      t1.start();
      Thread t2 = new Thread(mapPut);
      t2.start();

      t1.join();
      t2.join();

      System.out.println(map.size());
      System.out.println("min idx=" + map.keySet().stream().min(Integer::compareTo).get());
      System.out.println("max idx=" + map.keySet().stream().max(Integer::compareTo).get());
      System.out.println(map.keySet());
      map.keySet()
      .stream()
      .forEach(k -> System.out.println(k));

      Runnable tablePut = () -> {
        for (int i = 0; i < 100; i++) {
          table.put(i,String.valueOf(i));
        }
      };

      Thread t3 = new Thread(tablePut);
      t3.start();
      Thread t4 = new Thread(tablePut);
      t4.start();

      t3.join();
      t4.join();

      System.out.println("table size=" + table.size());
  }
}
