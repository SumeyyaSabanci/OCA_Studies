package Q_128_156;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q138{


public static void main(String[] args) {

        LocalDateTime dt =LocalDateTime.of(2014, 7, 31,1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));

    }
}

/*
What is the result?
A. An exception is thrown at runtime.
B. 2014-07-31T01:01:00
C. 2014-07-31
D. 2014-09-30T00:00:00

Answer: B


second Version:
LocalDate date1= LocalDate.now();
LocalDate date2= LocalDate.of(2014, 6, 20);
LocalDate date3= LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
System.out.println("date1 = "+ date1);
System.out.println("date2 = "+ date2);
System.out.println("date3 = "+ date3);

AssumethatthesystemdateisJune20,2014.Whatistheresult

Answer:
date1= 2014-06-20
date2 = 2014-06-20
date3 =2014-06-20

Third version same question */
