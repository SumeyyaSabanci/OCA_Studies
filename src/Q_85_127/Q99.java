package Q_85_127;

public class Q99 {

    /*
        Given the following main method:

        A. 5 4 3 2 1 0
        B. 5 4 3 2 1
        C. 4 2 1
        D. 5
        E. Nothing is printed
     */

    public static void main(String[] args) {
        int num =5;

        do {
            System.out.println(num-- + " ");
        } while (num==0);
    }
}
