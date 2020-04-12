package Q_61_84.Q72;

public class FieldInit {
    // What is the result?
    Character c;
    boolean b;
    float f;
    void printAll(){
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }

    //cevap : c = null
    //        b = false
    //        f = 0.0
}
