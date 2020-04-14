package Q_1_60;

public class Q30 {

    public static void main(String[] args) {
        int x = 1;
        int y =1;
        if(x++ < ++y) {
            System.out.print("Hello ");
        }else{
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);

        //what is the result?

    }
}
/*
What is the result?
A. Hello Log 2:2
B. Welcome Log 1:2
C. Welcome Log 2:1
D. Hello Log 1:2
Answer: A
 */