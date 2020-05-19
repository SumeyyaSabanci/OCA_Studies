package Q_85_127;

public class Q88 {
    public static void main(String[] args) {
//
//        int wd = 0;
//        String days[] = {"sun", "mon", "wed", "sat"};
//        for (String s : days) {
//            switch (s) {
//                case "sat":
//                case "sun":
//                    wd -= 1;
//                    break;
//                case "mon":
//                    wd -= 1;
//                    break;
//                case "wed":
//                    wd += 2;
//            }
//        }
//        System.out.println(wd);
//    }
//}
//What is the result?
//A. 3
//B. 0
//C. Compilation fails.
// D. -1
// Answer: D


//SECOND WAY
    int wd = 0;
    String days[] = {"sun", "mon", "wed", "sat"};
     for (String s : days) {
          switch (s) {
          case "sat":
          case "sun":
              wd -= 1;
              break;
          case "mon":
                wd++;
           case "wed":
                wd += 2;
     }
     }
                System.out.println(wd);
    }
}
// ANSWER:3
