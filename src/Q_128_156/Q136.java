
public class Q136 {

    //Given:

    static class A{
    public void test(){
        System.out.println("A  ");
    }
}

class B extends A{
        public void test(){
            System.out.println("B  ");
        }
}
    static class C extends A {
        public void test() {
            System.out.println("C  ");
        }
    }

    public static void main(String[] args) {
        A b1= new A();
        A b2 = new C();
        A b3 = (B) b2;    //line n1
        b1= (A) b2;  //line n2
        b1.test();
        b3.test();


    }

}
/*
What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.

 Answer: D

 No second version

 */