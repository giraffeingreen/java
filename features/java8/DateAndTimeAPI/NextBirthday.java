import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NextBirthday {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth date
        System.out.print("Enter your birth date (dd/MM/yyyy): ");
        String birthDateStr = scanner.nextLine();

        // Parse the birth date string into a LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);

        // Set the year of the birth date to the current year
        birthDate = birthDate.withYear(today.getYear());

        // Check if the birthday has already occurred this year
        if (birthDate.isBefore(today) || birthDate.isEqual(today)) {
            // If it has, set the birthday to next year
            birthDate = birthDate.plusYears(1);
        }

        // Calculate the exact number of days between today and the next birthday
        long daysUntilNextBirthday = ChronoUnit.DAYS.between(today, birthDate);

        System.out.println("There are " + daysUntilNextBirthday + " days until your next birthday.");

        // Close the Scanner object
        scanner.close();
    }
}
