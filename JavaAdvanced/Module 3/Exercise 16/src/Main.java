import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00+02:00");
    System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)));
    System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
  }
}
