package Q_61_84;

public class Q62 {
 //   What is the result?
           public static void main(String[] args) {
//            try{
//                int num = 10;
//                int div = 0;
//                int ans = num / div;
//            }catch (ArithmeticException ae){
//                ans = 0;                   //line n1
//            }catch (Exception e){
//                System.out.println("invalid calculation");
//            }
//            System.out.println("Ansver = " + ans);      //line n2

//ANSWER IS : E. Compilation fails at line n1 and line2
/*
              int num = 10;
//            int div = 0;
//            int ans = num / div;
these are local variables, we cannot use out of block them so ans gives error

 */
//second way

        int num =0, div = 0, ans;
        try{
            num = 10;
            div = 0;
            ans = num / div;
       }catch (ArithmeticException ae){
            System.out.println("This line gives error");
            ae.printStackTrace();
            ans = 0;                         //line n1
      }catch (Exception e){
           System.out.println("invalid calculation");
      }
      //    System.out.println("Ansver = " + ans);      //line n2

    }
}
