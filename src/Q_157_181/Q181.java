package Q_157_181;

public class Q181 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}

/*
Q181
What is the result?
A. A B C D
B. A C D
C. A C D D
D. A B D
E. A B D C
Answer: C
 */