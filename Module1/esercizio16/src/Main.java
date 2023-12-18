public class Main {
  public static void main(String[] args) {
    System.out.println(getDayOfTheWeek(1));
  }

  public static String getDayOfTheWeek(int number){
    String day = "";
    switch (number) {
      case 1:
        day = "Monday";
        break;
      case 2:
        day = "Tuesday";
        break;
      case 3:
        day = "Wednesday";
        break;
      case 4:
        day = "Thursday";
        break;
      case 5:
        day = "Friday";
        break;
      case 6:
        day = "Saturday";
        break;
      case 7:
        day = "Sunday";
        break;
      default:
        System.err.println("the number must be between 1 and 7");
        break;
    }
    return day;
  }
}
