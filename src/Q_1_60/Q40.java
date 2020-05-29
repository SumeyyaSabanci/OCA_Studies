package Q_1_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    public static void main(String[] args) {
        String [] arr = {"Hi","How","Are","You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf( s-> { //s degeri
            System.out.print(s); // s array listing tamamini yazdirir
            return s.length()<=2;  //sonra da lengthi 2 den kucuk olani remove yapar.
        })){
            System.out.print(" removed");
        }
//        else{
//            System.out.print("there is no ");
//        }
    }


}
//What is the result?
//A.	Compilation fails.
//B.	The program compiles, but it prints nothing.
//C.	HiHowAreYou removed
//D.	An UnsupportedOperationException is thrown at runtime.
//Answer: B

//explanation from main document. look at the document there is screenshot too
//class Main{
//    public static void main(String[] args) {
//        int n[][]={{1,3},{2,4}};
//        for (int i = n.length-1; i>=0; i--){
//            for(int j = n[i].length-1; j>=0; j--){
//                System.out.println(n[i][j]);
//            }
//        }
//    }
//}

//second version
class Soru168 {
public static void main(String[] args) {
    String [] arr = {"Hi","How","Are","You"};
    List<String> arrList = new ArrayList<>(Arrays.asList(arr));  //soruda sondaki parantez yoktu
    if(arrList.removeIf(s->
       s.length() <=2)) {
        System.out.println("removed");
    }
 //   System.out.println(Arrays.asList(arrList));
}
}
//What is the result?
//A.	Compilation fails.
//B.	Hi removed
//C.	An UnsupportedOperationException is thrown at runtime.
//D.	The program compiles, but it prints nothing.
//Answer: A

//third version

//soru farkliydi
//my code did not have compile error
//I dont remember answer
//change was (String s) was switched with only s
//sout("removed")
