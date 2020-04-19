package Q_85_127;


//class MyExceptions extends RuntimeException {}
//
//    public class Q90 {
//        public static void main(String[] args) {
//            try {
//                method1();
//            }
//            catch (MyExceptions ne) {
//                System.out.print("A");
//            }
//        }
//
//        public static void method1() {// line n1
//            try {
//                throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
//            }
//            catch (RuntimeException re) {
//                System.out.print("B");
//            }
//        }
//
//    }

//What is the result?
//A. A
//B. B
//C. Either A or B
//D. A B
//E. A compile time error occurs at line n1
// Answer: B




//85. Soru ile cok yakin
class MyExceptions extends RuntimeException {

}

public class Q90 {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (MyExceptions ne) {
            System.out.print("A");
        }
    }

    public static void method1() {// line n1
        try {
//            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
            throw 0.6 > 0.5 ? new MyException() : new RuntimeException();
        }
        catch (RuntimeException re) {
            System.out.print("B");
        }
    }

}
