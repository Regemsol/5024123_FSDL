import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeDemo {
    // Parse ISO-like datetime, return null on failure
    public static LocalDateTime parseIso(String s) {
        try {
            return LocalDateTime.parse(s);
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    // Add days using plusDays
    public static LocalDateTime addDays(LocalDateTime dt, long days) {
        return dt.plusDays(days);
    }

    // Format for readable output
    public static String formatDt(LocalDateTime dt) {
        return dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + formatDt(now));
        LocalDateTime later = addDays(now, 7);
        System.out.println("one week later: " + formatDt(later));

        String[] samples = {"2023-05-01T12:30:00", "bad-date"};
        for (String s : samples) {
            LocalDateTime parsed = parseIso(s);
            System.out.println(s + " -> " + (parsed != null ? parsed : "invalid"));
        }
    }
}
