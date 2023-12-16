public class DemoSwitch {

  public static void main(String[] args) {
    
    System.out.println(get(Weekday.WEDNESDAY));

    Weekday day = Weekday.WEDNESDAY;
    String dayString = switch(day) {
      case MONDAY -> "Monday";
      case TUESDAY -> "Tuesday";
      case WEDNESDAY -> "Wednesday";
      case THURSDAY -> "Thursday";
      case FRIDAY -> "Friday";
    };

    System.out.println(dayString);

    System.out.println(get2(Weekday.WEDNESDAY));
  }

  public static String get(Weekday weekday) {
    String day = "";
    switch (weekday) {
      case MONDAY:
        day = "Monday";
        break;
      case TUESDAY:
        day = "Tuesday";
        break;      
      case WEDNESDAY:
        day = "Wednesday";
        break;      
      case THURSDAY:
        day = "Thursday";
        break;
      case FRIDAY:
        day = "Friday";
        break;
      default:      
    }
    return day;
  }

  // Similar to Lambda 
  public static String get2(Weekday weekday) {
    return switch(weekday) {
      case MONDAY -> "Monday";
      case TUESDAY -> "Tuesday";
      case WEDNESDAY -> "Wednesday";
      case THURSDAY -> "Thursday";
      case FRIDAY -> "Friday";
    };
  }

  public static get3(Weekday weekday) {
    return switch (weekday) {
      case MONDAY:
        yield "Monday";
      case TUESDAY:
        yield "Tuesday";
      case WEDNESDAY: 
        yield "Wednesday";
      case THURSDAY:
       yield "Thursday";
      case FRIDAY:
       yield "Friday";        
    };
  }
}
