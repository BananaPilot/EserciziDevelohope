import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainTest {

  @Test
  public void main() {
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    System.out.println(date.format(DateTimeFormatter.ofPattern("DD mmmm YYYY").localizedBy(Locale.ITALIAN)));
  }

  @Test
  public void main2() {
    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    System.out.println(date.format(DateTimeFormatter.ofPattern("dd MM YYYY").localizedBy(Locale.ITALIAN)));
  }
}