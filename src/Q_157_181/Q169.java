package Q_157_181;

public class Q169 {
    public static void main(String[] args) {
        int x =1;
        int y = 0;
        if(x++ > ++y){
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
        System.out.println("log "+ x + ":" + y);
    }
}

/*
iteration x'in saginda oldugu icin hemen degil de bir sonraki islemde 1 deger arttirir. Solunda olunca da 1 deger azaltir.
if statement da 1=1 yanlis olacagi icin else condition i dogrudur. En sondaki sout'da x in degeri 1 artacagi icin cevap
Welcome Log 2:1
olur
 */

//What is the result?
//A. Hello Log 1:0
//B. Hello Log 2:1
//C. Welcome Log 2:1
//D. Welcome Log 1:0
// Answer: C