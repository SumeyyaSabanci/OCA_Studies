package Q_85_127;

public class Q103 {
}
class A {
     public A(){
        System.out.println("A ");
        }
}

class B {
    public B(){
        System.out.println("B ");
    }
}

class C {
    public C(){
        System.out.println("C ");
    }

    public static void main(String[] args) {
       C c = new C();

    }
}

/*
        What is the result?
        A. C B A
        B. C
        C. A B C
        D. Compilation fails at line n1 and line n2
 */