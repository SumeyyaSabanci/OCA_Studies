package Q_128_156;

public class Q128 {
}
    class Caller {

    private void init () {
     System.out.println ("Initialized");
    }

     private void start () {
                   init ();
     System.out.println ("Started");
    }

}

//    public class TestCall {
//    public static void main (String [] args) {
//        Caller c = new Caller();
//        c.start();// line n1
//        c.init();//line n2
//    }
//}
        // What is the result?
     //  A. Compilation fails at line n1.
     //  B. InitializedStartedInitialized
     //  C. InitializedStarted
     //  D. Compilation
     //  Answer : D



