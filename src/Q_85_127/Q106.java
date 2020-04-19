package Q_85_127;

public class Q106{

}

class Test2 {
    public static void main(String[] args) {
        Test2 ts = new Test2();
        System.out.println(isAvailable+"");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);

    }
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable = false;
}
/*
What is the result?
A.	Compilation fails.
B.	false true
C.	true false
D.	true true
E.	false false
Answer: B

 */
