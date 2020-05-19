package Q_1_60;

public class Q56 {

    //56. Given the code fragment:
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");
        }

        /*
        A
    omas
    Invalid Name
    null

        B
    omas
    ter
    seph

        C
    Invalid Name

        D
    omas
    Invalid Name

    A. Option A
    B. Option B
    C. Option C
    D. Option
    D Answer: D

         */

        /*
        second way

        public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                idx++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");
        }
        for(String p : pwd){
         System.out.println(p);
         }

         What is the result?

         A. Invalifd Name
         B. Invalid Nameomas
         C. Invalid Name omas null null
         D. omasterseph

         Answer: C


         */



    }
}
