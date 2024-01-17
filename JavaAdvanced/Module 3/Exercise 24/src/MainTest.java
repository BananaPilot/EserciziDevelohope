import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.Assert.*;

public class MainTest {

  @org.junit.Test
  public void main() {
    OffsetDateTime date = getDate();
    int year = date.getYear();
    Month month = date.getMonth();
    int day = date.getDayOfYear();
    String dayS = date.getDayOfWeek().toString().toLowerCase();
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(dayS);
  }

  @org.junit.Test
  public void main2() {
    OffsetDateTime date = getDate();
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();
    String dayS = date.getDayOfWeek().toString().toLowerCase();
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(dayS);
  }

  public OffsetDateTime getDate() {
    return OffsetDateTime.parse("2023-03-01T13:00:00Z");
  }
}