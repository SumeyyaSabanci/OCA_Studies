package OCA2020Modify223qNewQuestions;

public class Q20 {
    public static void main(String[] args) {
        char colorCode = 'y';
        //    int color =2; boyle dısarda tanımlanmalıydı
        switch (colorCode){
            case 'r':
                int color = 100; // burda tanımlanmıs hata vermiyor ama kullanılabilir degil
                break;
            case 'b':
                color =10;
                break;
            case 'y':
                color =1;
                break;
        }
        //  System.out.println(color);
    }
}
