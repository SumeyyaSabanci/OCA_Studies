package Q_1_60;

public class Q16 {

    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    continue;                  //continue nun altina bisey yazamayiz yazarsak compile error verir
                }
            }
            continue;
        }
    }
//        String [] [] arr = {{ "A", "B", "C"},  {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for ( int j = 0; j< arr[i].length; j++) {
//                System.out.println(arr[i][j] + " ");
//                if ( arr[i][j].equals("B")) {
//                   break;
//                }
//            }
//            continue;
//        }
//    }

//    String [] [] arr = {{ "A", "B", "C"},  {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//        for ( int j = 0; j< arr[i].length; j++) {
//            System.out.println(arr[i][j] + " ");
//            if ( arr[i][j].equals("B")) {
//                continue;
//            }
//        }
//        break;
//    }
//}


//    String [] [] arr = {{ "A", "B", "C"},  {"D", "E"}};
//        for (int i = 0; i < arr.length; i++) {
//        for ( int j = 0; j< arr[i].length; j++) {
//
//        if ( arr[i][j].equals("B")) {
//        return;
//        System.out.println(arr[i][j] + " ");
//        }
//
//        }
//        continue;
//        }
//        }
//When we run it prints A B C D E

// what is the result?
/**

 A. A B C
 B. A B C D E
 C. A B D E
 D. Compilation fails

 ans:D
 */
}