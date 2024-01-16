import java.time.OffsetDateTime;
public class Main {
  public static void main(String[] args) {
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    OffsetDateTime date1 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
    System.out.println(date.isBefore(date1));
    System.out.println(date1.isAfter(date));
    System.out.println(date.isEqual(OffsetDateTime.now()));
  }
}
