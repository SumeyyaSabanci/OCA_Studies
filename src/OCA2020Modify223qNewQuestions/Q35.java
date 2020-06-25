package OCA2020Modify223qNewQuestions;

public class Q35 {
    public static void main(String[] args) {
        int[] stack ={10,20,30};
        int size=3;
        int idx=0;
        // c option
        // do{
        //    idx++;
        //   }while (idx <size-1);

        // e option
        while (idx<= size-1){
            idx++;
        }

        System.out.println("The Top Element : "+stack[idx]);
    }
}
