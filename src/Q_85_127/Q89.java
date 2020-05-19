package Q_85_127;

public class Q89 {
//    public static void main(String[] args) {
//        int x = 6;
//        while (isAvailable(x)) {
//            System.out.print(--x);
//        }
//    }
//    public static boolean isAvailable(int x) {
//        return --x > 0 ? true : false;
//    }
//}

//Which modification enables the code to print 54321?
//A. Replace line 6 with System.out.print (--x);
//B. At line 7, insert x --;
//C. Replace line 5 with while (is Available(--x)) {
//D. Replace line 12 with return (x > 0) ? false : true;
// Answer: A


// SECOND WAY

    public static void main(String[] args) {
        int x = 5;
        while (isAvailable(x)) {
            System.out.print(x);
             x--;
        }
    }

    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }
}

// ANSWER: at line7, insert x--