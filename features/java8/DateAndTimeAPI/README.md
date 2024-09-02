# Date and Time API
Java 8 introduced a new Date and Time API that provides a more comprehensive and flexible way to work with dates and times.

## When to use
- When you need to work with dates and times in a more intuitive and less error-prone way.
- To replace the old java.util.Date and java.util.Calendar classes.
- To handle time zones and durations more effectively.

## Examples
Here are some examples of using the Java 8 Date and Time API:

1. Creating a LocalDate object:
```java
LocalDate date = LocalDate.now();
```

2. Formatting a LocalDateTime object:
```java
LocalDateTime dateTime = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = dateTime.format(formatter);
```

3. Calculating the difference between two dates:
```java
LocalDate date1 = LocalDate.of(2022, 1, 1);
LocalDate date2 = LocalDate.of(2022, 12, 31);
long daysBetween = ChronoUnit.DAYS.between(date1, date2);
```

## Practice Exercises
Try these exercises to practice using the Java 8 Date and Time API:

1. Write a program that calculates the number of days until your next birthday.
2. Create a method that takes a LocalDateTime object and returns the time in 12-hour format.
3. Implement a function that determines if a given year is a leap year or not.

Have fun practicing with the Java 8 Date and Time API!

