import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    public static String formatTo12Hour(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        // Example usage
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current time in 12-hour format: " + formatTo12Hour(now));
    }
}