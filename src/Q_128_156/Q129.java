package Q_128_156;


//interface I {
//    public void displayI();
//}
//
//abstract class C2 implements I {
//    public void displayC2() {
//        System.out.print("C2");
//    }
//}
//
//
//class C1 extends C2 {
//    public void displayI() {
//        System.out.print("C1");
//    }
//}
//
//public class Q129 {
//    // And the code fragment:
//    public static void main(String[] args) {
//
//        C2 obj1 = new C1();
//        I obj2 = new C1();
//
//        C2 s = (C2) obj2;
//        I t = obj1;
//        t.displayI();
//        s.displayC2();
//
//    }
//}
//What is the result?
// A. C1C2
// B. C1C1
// C. Compilation fails.
// D. C2C2
// Answer: A
// Explanation:

//        interface I { public void displayI();
//         }
//         abstract class C2 implements I {
//          public void displayC2() {
//          System.out.print ("C2");
//          }
//          }
//          class C1 extends C2 {
//          public void displayI() {
//          System.out.print("C1");
//           }
//           }
//           public class App {
//           public static void main(String[] args) {
//           C2 objl = new C1();
//           I obj2 = new C1();
//
//           C2 s= (C2) obj2;
//           I t = objl;
//
//           t.displayI();
//           s.displayC2();
//           }
//           }
           /*
           *: Console 2 *: Console 4 Console 3 Console 1
           CIC2 Completed with exit code: 0
 */



//Q_74

    class C2 {
        public void displayC2() {
            System.out.print("C2");
        }
    }
     interface I{
     public void displayI ();
      }
      class C1 extends C2 implements I {
       public void displayI (){
       System.out.print ("C1");
       }

 //      And given the code fragment:
        public static void main(String[] args) {
//            C2 obj1 =new C1();
//            I obj2 = new C1();
//            C2 s =obj2;
//            I t =obj1;
//
//            t.displayI();
//            s.displayC2();
/*
            What is the result?
            A.C2C2
            B.C1C2
            C.C1C1
            D.Compilation fails -- > Asil Cevap
            Answer:
            A X*/
        }}