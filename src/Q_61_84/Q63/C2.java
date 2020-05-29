package Q_61_84.Q63;

public class C2 {
    public void displayC2() {
        System.out.println("C2");
    }
}
interface I {
    public void displayI ();
}
class C1 extends C2 implements I {
    public void displayI() {
        System.out.println("C1");

    }
//        //And given the code fragment:
        public static void main (String[]args){


            C2 obj1 = new C1();
            I obj2 = new C1();

//            C2 s = obj2;  //class'a interface in objectini assign ettis o yuzden hata verir
//            I t = obj1;   //class'a class i,  interface e interface i assign yapabiliriz

//            t.displayI();
//            s.displayC2();

        }
    }
// dogru cevap Compilation fails (bir yerde de cevabi A olarak gostermis lakin asil cevap compilation fails olmali


