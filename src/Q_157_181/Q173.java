package Q_157_181;

public class Q173 {
    public static void main(String[] args) {

        int num = 5;
        do {
            System.out.println(num-- +" ");
        } while (num == 0);
    }
}
//what is the result?
//A) 543210
//B) 54321
//C) 421
//D) 5

// dogru cevap '5'. Cunku doWhile loop'unda sartlar ne olursa olsun (no matter what) do statement i execute olur. num-- ise ilk basta
// etkisini gostermeyecegi icin 5 olarak yazilir. While condition'indaki 0 yanlis bir condition oldugu icin yani bes (5) sifira esit
// olmayacagi icin bir kez yazdirip for loop islemi tamamlanmis olacak