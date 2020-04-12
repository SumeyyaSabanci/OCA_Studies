package Q_1_60;

public class Q18 {
}
class Test {
    public static void main(String[] args) {

        String [] [] chs = new String[5][];   //  {{1,2},{3,4},{5,6},{7,8},{9,10}}
        chs [0] = new String [2];
        chs [1] = new String [5];             //  {{1,2},{3,4,11,12,13.14},{5,6},{7,8},{9,10}}
        int i = 97;
       System.out.println(chs[1].length);


//        for ( int a = 0; a< chs.length; a ++){
//            for (int b = 0; b < chs.length; b++){
//                chs[a][b] = " " + i;
//                i++;
//
//            }
//        }
        for (String[] ca : chs){
            for (String c : ca){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
/**
 * What is the result?
 * A. 97 9899 100 null null null
 * B. 97 9899 100 101 102 103
 * C. Compilation fails.
 * D. A NullPointerException is thrown at runtime.
 * E. An ArrayIndexOutOfBoundsException is thrown at runtime.
 *
 * Answer: E
 *
 * Explanation:
 Console:
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index2 out of bounds for length 2
 at Test.main(Test.java:11)

 Completed with exit code: 1
 */
/*
 for ( int a = 0; a< chs.length; a ++){
            for (int b = 0; b < chs[a].length; b++){
                chs[a][b] = " " + i;
                i++;

            }
        }
 */