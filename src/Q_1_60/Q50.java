package Q_1_60;

public class Q50 {
    /*

50. Which statement will empty the contents of a StringBuilder variable named sb?
A. sb. deleteAll (); --> gives error because StringBuilder doesn't have deleteAll () method
B. sb. delete (0, sb. size () );--> gives error because StringBuilder doesn't have size () method
C. sb. delete (0, sb. length () );
D. sb. removeAll (); --> gives error because StringBuilder doesn't have removeAll () method
Answer: C
   */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.delete(0,sb.length()); //--> deletes the string
        System.out.println(sb);
    }
}
