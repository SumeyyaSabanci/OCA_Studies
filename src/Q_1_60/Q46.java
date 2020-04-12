package Q_1_60;

public class Q46 {
    public static void main(String[] args) {
        String names [] = {"Thomas", "Peter", "Joseph"};
        String pwd [] = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2,6);
                idx++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");
        }
        for (String p : pwd){
            System.out.println(p);
        }
    }
    //What is result?

//A
// Invalid Name

//B
// Invalid Name
// omas

//C
// Invalid Name
// omas
// null
// null

//D
// omas
// ter
// seph

//A.	Option A
//B.	Option B
//C.	Option C
//D.	Option D
//Answer: C

    //second version

//    public static void main(String[] args) {
//        String names [] = {"Thomas", "Peter", "Joseph"};
//        String pwd [] = new String[3];
//        int idx = 0;
//        try{
//            for(String n : names){
//                pwd[idx] = n.substring(2,6);
//                idx++;
//            }
//        }
//        catch (Exception e){
//            System.out.println("Invalid Name");
//        }
//        //there is no if block
//        System.out.println(pwd[idx]);
//    }


   // Answer
    //     omas
    //     Invalid Name
}



