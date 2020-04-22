package Q_85_127;

public class Q121 {
    public static void main(String[] args) {
        String myStr = "Hello World ";
        myStr.trim();
        int i1 = myStr.indexOf(" "); //first mat
        System.out.println(i1);
        System.out.println("*"+myStr+"*");
    }
}
/*
What is the result?
A. An exception is thrown at runtime
B. -1
C. 5
D. 10

Answer: C
 */

// Second version

/*
  public static void main(String[] args) {
        String myStr = " Hello World";
        myStr.trim();
        int i1 = myStr.indexOf(" ");
        System.out.println(i1);
    }
}

Answer:0

 */
