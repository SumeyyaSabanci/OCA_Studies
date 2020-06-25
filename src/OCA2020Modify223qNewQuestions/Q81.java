package OCA2020Modify223qNewQuestions;

public class Q81 {
    public static void main(String[] args) {
        int x= 5;
        while (isAvailable(x)){
            System.out.print(x);
            x--;  // bu satır sonradan eklendi
        }
    }


    public static boolean isAvailable(int x){
        return x-- > 0 ? true : false;
    }
// which modification enables the code to print 54321 ?

    //  at line 7, insert x--
}