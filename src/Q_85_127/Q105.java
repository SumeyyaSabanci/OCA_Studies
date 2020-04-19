package Q_85_127;

public class Q105 {
}

class Test3 {
    int x, y;

    public Test3(int x, int y) {
        initialize(x, y);
    }
        public void initialize ( int x, int y){
        this.x = x * x;
        this.y = y * y;
    }
        public static void main (String[]args){
        int x = 9, y = 5;
        Test3 obj = new Test3(x, y);
        System.out.println(x + " " + y);
        System.out.println(obj.x+" "+obj.y);
    }
    }
//
/*
* What is the result?
A. 9 5
B. 81 25
C. Compilation Fails
D. 0 0
*/

