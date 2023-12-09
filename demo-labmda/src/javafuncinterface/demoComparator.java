package javafuncinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class demoComparator {

  public static void main(String[] args) {
    // int compare(T t1, T t2)
    Comparator<Customer> sortByName = 
        (c1, c2) -> c1.getName().compareTo(c2.getName());

    Comparator<Customer> sortByJoinDate = (c1, c2) -> c1.getJoinDate().isBefore(c2.getJoinDate()) ? 1 : -1;

    Comparator<Customer> sortByNameAndThenJoinDate = 
      sortByName.thenComparing(sortByJoinDate);

    Customer a1 = new Customer("John", LocalDate.of(2010, 1, 7));
    Customer a2 = new Customer("Ann", LocalDate.of(2000, 10, 7));
    Customer a3 = new Customer("John", LocalDate.of(2000, 10, 7));
    Customer a4 = new Customer("Jenny", LocalDate.of(1999, 1, 10));

    List<Customer> customers = new ArrayList<>(List.of(a1,a2,a3,a4));
    System.out.println(customers);
    Collections.sort(customers, sortByNameAndThenJoinDate);
    System.out.println(customers);   
    System.out.println(a1.getName().compareTo(a2.getName()));
  }




}
