import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainTest {

  @Test
  public void main() {
    OffsetDateTime date = getDate();
  }

  public OffsetDateTime getDate() {
    return OffsetDateTime.parse("2002-03-01T13:00:00+02:00");
  }
  @Test
  public void parseFull() {
    getDate().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
  }

  @Test
  public void parseMedium() {
    getDate().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
  }

  @Test
  public void parseShort() {
    getDate().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
  }
}