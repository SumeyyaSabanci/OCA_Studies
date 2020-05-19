package Q_1_60.Q27;

public class Test {

    public static int stVar = 100;
    public int var =200;

    public String toString () {
        return stVar + ":" + var;

    }

    public static void main(String[] args) {
        //And given the code fragment
        Test t1 = new Test();
         t1.var =300;
         System.out.println(t1);

        Test t2 = new Test ();
        t2.stVar =300;
        System.out.println(t2);

        //what is the result?
    }

}
/*
What is the result?
A. 300:300200:300
B. 300:100200:300
C. 300:00:300
D. 100:300300:200
Answer: D
 */