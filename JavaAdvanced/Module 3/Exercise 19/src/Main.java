import java.time.OffsetDateTime;
import java.time.temporal.TemporalField;

public class Main {
  public static void main(String[] args) {
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    date = date.plusYears(1);
    date = date.minusMonths(1);
    date = date.plusDays(7);
    System.out.println(date);
  }
}
