package Q_85_127;

import java.util.ArrayList;

public class Q104{
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("My String");
            }
        }catch (RuntimeException re){
            System.out.println("Cought a RuntimeException");
        }catch (Exception e){
            System.out.println("Cought an Exception");
        }
        System.out.println("Ready to use");
    }

}
/*
What is the result?
A.	Execution terminates in the first catch statement, and Caught a RuntimeException is printed to the console.
B.	Execution terminates in the second catch statement, and Caught an Exception is printed to the console.
C.	A runtime error is thrown in the thread "main".
D.	Execution completes normally, and Ready to use is printed to the console.
E.	The code fails to compile because a throws keyword is required.
Answer: C

 */