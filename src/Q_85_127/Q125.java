package Q_85_127;

public class Q125 {
}
//Base.java:
class Base{
    public void test(){
        System.out.println("Base ");
    }
}

// DerivedA.java:
class DerivedA extends Base {
    public void test() {
        System.out.println("DerivedA ");
    }
}
//DerivedB.java:
class DerivedB extends DerivedA {
    public void test () {
        System.out.println("DerivedB ");
    }
    public static void main (String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3; //new DerivedB();
        b1 = (Base) b2; //new DerivedA();
        b1.test();
        b4.test();
    }

}
////Answer: DerivedADerivedB