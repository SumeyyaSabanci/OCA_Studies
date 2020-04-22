package Q_85_127;

public class Q110 {
}
class MainTest{
    public static void main(int[] args) {
        System.out.println("int main "+ args[0]);

    }
    public static void main(Object[] args) {
        System.out.println("Object main "+ args[0]);

    }
    public static void main(String[] args) {
       System.out.println("String main "+ args[0]);

    }

    //String args[]: The main() method also accepts some data from the user.
    // It accepts a group of strings, which is called a string array.
    // It is used to hold the command line arguments in the form of string values.
    // Here, agrs[] is the array name, and it is of String type.

//     Java Compiler(JVM) has a predefined syntax which differentiates public static void main (String[] args) from other main().
//     The JVM looks for the exact match and compiles the java program, hence String args is mandatory to use to match it with its syntax.
//     The significance of this String args[] is that it accepts command line arguments and store it in the array of strings. "

}
//commands
//javac MainTest.java
//java MainTest 1 2 3
/*
What is the result?
A.	int main 1
B.	Object main 1
C.	String main 1
D.	Compilation fails
E.	An exception is thrown at runtime
Answer: C

 */