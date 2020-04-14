package day01_Lambda;


interface SinavMerkezi {
    void sinav();  //default olarak public abstract
}
abstract class Okul implements SinavMerkezi{
    public void sinav(){
        System.out.println("Ders Adi");
        System.out.println("Ogretmen Adi");
        System.out.println("1.soru ");
        System.out.println("2.soru");
    }
}

class Matemamik extends Okul{
    public void sinav(){
        System.out.println("Matematik Sinavi");
        System.out.println("1. a ve b sayisinin toplami");
        System.out.println("2. 4 vve 5 sayisinin carpimi nedir");
    }
}
class Fizik extends Okul{
    public void sinav(){
        System.out.println("Fizik sinavi");
        System.out.println("Vektorleri aciklayiniz");
        System.out.println("Karadelik hakkinda bildiklerinizi yaziniz");
    }
}
class Biyoloji extends Okul{
//    public void sinav(){
//        System.out.println("Biyoloji sinavi");
//        System.out.println("Hucre nedir aciklayiniz");
//        System.out.println("Kalitim nedir");
//    }
}

public class Lambda{

    public static void main(String[] args) {
        SinavMerkezi fizik = new Fizik();
        fizik.sinav();
        SinavMerkezi mat = new Matemamik();
        mat.sinav();
        SinavMerkezi bio = new Biyoloji();
        bio.sinav();
    }

}