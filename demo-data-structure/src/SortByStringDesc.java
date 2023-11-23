import java.util.Comparator;

public class SortByStringDesc implements Comparator<String> {
  
  @Override
  public int compare(String x, String y) {
    // int xHead = x.toUpperCase().charAt(0);
    // int yHead = y.toUpperCase().charAt(0);
    // return yHead > xHead ? 1 : -1;
    return y.compareTo(x) > 0 ? 1 : -1;
  }

}
