package Q_85_127;
//
public class Q93 {

}
    class Caller {
        private void init() {
            System.out.println("Initialized");
        }

        private void start() {
            init();
            System.out.println("Started");
        }
    }

    class TestCall {
        public static void main(String[] args) {
            Caller c = new Caller();
//            c.start();
//            c.init();
        }
    }

//What is the result?
//A. An exception is thrown at runtime.
// B. InitializedStartedInitialized
//C. InitializedStarted
// D. Compilation fails.
// Answer: D
