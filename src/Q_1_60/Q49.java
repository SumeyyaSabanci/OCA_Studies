package Q_1_60;

public class Q49 {
    public static void main(String[] args) {
      int [] array = {10, 20, 30, 40, 50};
      int x = array.length; //5
      /* line 1  */
        /*
        Which two code fragments can be independently inserted at line n1 to enable the code to print
        the elements of the array in reverse order? (Choose two.)
         */
//        // A
//        while (x > 0){
//            x--;
//            System.out.println(array[x]);
//        }
//
//        //B
//        do {
//            x--;
//            System.out.println(array[x]); //--> gives ArrayIndexOutOfBoundsException at that line
//        }while (x >= 0);
//
//        // C
//        while (x >= 0){
//            System.out.println(array[x]); //--> gives ArrayIndexOutOfBoundsException at that line
//            x--;
//        }
//
//        //D
//        do {
//            System.out.println(array[x]);//--> gives ArrayIndexOutOfBoundsException at that line
//            x--;
//        }while (x >= 0);
//
//        // E
//        while (x > 0){
//            System.out.println(array[--x]);
//        }
    }
   // Answer is A and E
}
