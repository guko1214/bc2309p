import java.time.LocalDate;

public class LocalDateTest {

  int year;
  int month;
  int day;

  public LocalDateTest(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public boolean isBetween(LocalDate date1, LocalDate date2) {   
    LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);
    if (thisDate.isEqual(date1) || thisDate.isEqual(date2))
      return true;
    if (thisDate.isAfter(date1) && thisDate.isBefore(date2))
      return true;
    return false;
  }

  public static void main(String[] args) {
    // LocalDate date = new LocalDate(); // not allowed 
    LocalDate date = LocalDate.of(2023, 12, 31);
    
    System.out.println(date.getMonth()); // DECEMBER
    System.out.println(date.getDayOfWeek()); // SUNDAY
    System.out.println(date.getDayOfMonth());
    System.out.println(date.getDayOfYear());

    LocalDate date2 = LocalDate.of(2024, 2, 27);
    System.out.println(date2.isAfter(date));

    LocalDateTest date3 = LocalDateTest.of(1900, 10, 31);

    date3.isBetween(date,date2);

    System.out.println(date.compareTo(date2) == -1); // -1
    System.out.println(date2.compareTo(date) == 1); // 1

    System.out.println(LocalDate.now());

    LocalDate date4 = LocalDate.parse("2024-08-04");
    System.out.println(date4);
    System.out.println(date4.getYear());

  }

  public static LocalDateTest of(int year, int month, int day) {
    return new LocalDateTest(year, month, day);
  }

}
