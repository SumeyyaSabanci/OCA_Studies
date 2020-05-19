package Q_1_60;

public class Q14 {
}
class App {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = (j += i) / 5;
//second version da parantez kaldirilmis
//      int k = j=j+ i / 5;
        System.out.println(i + " : " + j + " : " + k);

        // What is the result?

        //A. 10 : 30 : 6
        //B. 10 : 22 : 22
        //C. 10 : 22 : 20
        //D. 10 : 22 : 6

        //Ans: A

    }
}