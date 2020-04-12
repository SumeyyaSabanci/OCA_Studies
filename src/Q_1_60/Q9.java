package Q_1_60;



public class Q9 {

    class C {
        public C() {
            System.out.println("C");
        }
    }

    class B extends C {
        public B() {                   //line n1
        System.out.println("B");
    }
    }

    public class A extends B {           //line n2
        public A() {
            System.out.println("A");
        }

  //      public static void main(String[] args) {
            A a = new A();
        }
    }
//second version da classlarin yeri degismis



// what is the result ?

/*
What is the result?

A. C B A
B. C
C. A B C
D. Compilation fails at line n1 and line n2

Answer: A
 */