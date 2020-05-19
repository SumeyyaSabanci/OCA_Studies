package Q_85_127;
public class Q95{

}
//Q125 similar
 //Base.java:
//class Base{
//            public void test(){
//        System.out.println("Base ");
//        }
//        }
//
//       // DerivedA.java:
//class DerivedA extends Base {
//    public void test() {
//        System.out.println("DerivedA ");
//    }
//}
//        //DerivedB.java:
//class DerivedB extends DerivedA {
//    public void test () {
//        System.out.println("DerivedB ");
//    }
//    public static void main (String[] args) {
//        Base b1 = new DerivedB();
//        Base b2 = new DerivedA();
//        Base b3 = new DerivedB();
//        b1 = (Base) b3;
//        Base b4 = (DerivedA) b3; //castlarin hukmu olmadigi icin yine bize DerivedB yi yazdirir.
//        b1.test();
//        b4.test();
//    }
//
//}

//What is the result?
//A. BaseDerivedA
//B. BaseDerivedB
//C. DerivedBDerivedB
//D. DerivedBDerivedA
//E. A ClassCastException is thrown at runtime.
// Answer: C

//Second Way:
////Base.java:
//class Base{
//    public void test(){
//        System.out.println("Base ");
//    }
//}
//
//// DerivedA.java:
//class DerivedA extends Base {
//    public void test() {
//        System.out.println("DerivedA ");
//    }
//}
////DerivedB.java:
//class DerivedB extends DerivedA {
//    public void test () {
//        System.out.println("DerivedB ");
//    }
//    public static void main (String[] args) {
//        Base b1 = new DerivedB();
//        Base b2 = new DerivedA();
//        Base b3 = new DerivedB();
//        b1 = (Base) b2;
//        b4 = b3;
//        Base b4 = (DerivedA) b3;
//        b1.test();
//        b4.test();
//    }
//
//}
//Answer: DerivedADerivedB
