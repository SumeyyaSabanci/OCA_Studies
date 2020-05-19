package Q_61_84.Q66;

public class Test {
   static int count = 0;  //5 //takip ettigimiz yerde ; yoktu baska bir yerle karsilastirinca ; isareti vardi
    int i = 0; //5
    public void changeCount(){
        while (i < 5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " : " + check2.count);
    }
//second version
//    int count = 0;  //5 //takip ettigimiz yerde ; yoktu baska bir yerle karsilastirinca ; isareti vardi
//    static int i = 0; //5
//    public void changeCount(){
//        while (i < 5){
//            i++;
//            count++;
//        }
//    }
//
//    public static void main(String[] args) {
//        Test check1 = new Test();
//        Test check2 = new Test();
//        check1.changeCount();
//        check2.changeCount();
//        System.out.println(check1.count + " : " + check2.count);
//    }
}
// cevap  10 : 10 fakat baska bir yerde sorunun farklisi cikmis cevap 5 : 0