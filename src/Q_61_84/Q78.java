package Q_61_84;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q78 {

    public static void main(String[] args) {
        String date = LocalDate
                    .parse("2014-05-04")
                    .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}

/*
Answer D : An exception is thrown at runtime
The exception : Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
 */
