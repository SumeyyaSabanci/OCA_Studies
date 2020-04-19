package Q_85_127;

public class Q102 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if (sb.toString().equals(s.toString())){
            System.out.println("March 1");
        }else if(sb.equals(s)){
            System.out.println("March 2");
        }else {
            System.out.println("No Match");
        }

    }
}
/*
What is the result?
A.	Match 1
B.	Match 2
C.	No Match
D.	A NullPointerException is thrown at runtime.
Answer: A

 */