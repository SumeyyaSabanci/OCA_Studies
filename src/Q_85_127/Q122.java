package Q_85_127;

import java.time.LocalDate;

public class Q122 {
//    public static void main(String[] args) {
//        LocalDate date= LocalDate.of(2012, 1, 30);
//        date.plusDays(10);
//        System.out.println(date);
//    }
//}
/*
What is result?
A. 2012-02-10
B. 2012-01-30
C. 2012-02-10 00:00
D. A DateTimeException is thrown at runtime

Answer: B

 */

// 2. version


    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 32);
        date.plusDays(10);
        System.out.println(date);
    }
}
/*
  What is result?
A. 2012-02-10
B. 2012-02-11
C. Complatation fails
D. A DateTimeException is thrown at runtime

Answer: ?

 */



