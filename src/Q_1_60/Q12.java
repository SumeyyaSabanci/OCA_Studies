package Q_1_60;

public class Q12{ }

class Test1 {
    public static void main(String[] args) {
        if (args[0].equals("Hello") ? true : false) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
// run --> edit configuration -->
//    public static void main(String[] args) {
//        if (args[0].equals("Hello") ? false : true){
//            System.out.println("Success");
//        }else {
//            System.out.println("Failure");
//        }
//    }
//}
// And given the commands :
// javac Test.java
// Java Test Hello

// What is the result?
// A Success
/*
Second Version
changed
inside if statement true and false is switched
answer is
succes
 */


