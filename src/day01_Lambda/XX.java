package day01_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface IntOp{
    int sum(int a, int b);  //lambda icinde sadece bir method kullanabiliyoruz //lambda
}
class Action implements IntOp {  //bu nun yerine
    public int sum(int a, int b){
        return a+b;
    }
}


public class XX {
    public static void main(String[] args) {
        IntOp toplama;

//        toplama = (x,y) -> x+y;
//        System.out.println(toplama.sum(3,5));

//        IntOp tp = new Action();
//        System.out.println("Standart method : "+tp.sum(3,5));

          IntOp tp;
        tp=(x,y)-> x+y;
        System.out.println("Lambda sihirbazi : "+tp.sum(3,5));

        List<Integer> aliabi = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,89,90));
        System.out.println("Orignial liste : "+aliabi);
        aliabi.removeIf(x->x%2==00);
        System.out.println("Cift sayilar : "+aliabi);
        aliabi.forEach(x->System.out.println(x));
        aliabi.forEach(x->System.out.println(x+3)); //3 eklersek



    }
}

//before changes we did this
//interface IntOp{
//    int sum();
//}
//class Action implements IntOp {  //bu nun yerine
//    public int sum(){
//        return 4+5;
//    }
//}
//
//
//public class XX {
//    public static void main(String[] args) {
//        IntOp toplama;
//        toplama = () -> 3+5;
//        System.out.println(toplama.sum());
//
//    }
//}
