package Q_1_60;


public class Q1 {
    public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];

        bool[0] = new Boolean(Boolean.parseBoolean("TRUE"));
        bool[1] = new Boolean(null);  //null in degeri olmadigi icin false donusur

        System.out.println(bool[0] + " " + bool[1]);
    }

}

/*
Second Version
this is changed
bool[0] = new Boolean(1);
bool[1]=new Boolean(boolean.parseBoolean("true"));
.println(bool[0]+" "+bool[1]);
answer is =
false true
cengiz: if you dont see true then false
 */

// What is teh result?
// A True False
//B. True null
//C. Compilation fails
//D. A NullPointerException is thrown at runtime

//Answer : A
