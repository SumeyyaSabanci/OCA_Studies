package Q_85_127;

public class Q87 {
//    public static void main(String[] args) {
//
//        int n[][] = {{1, 3}, {2, 4}};
//        for (int i = n.length - 1; i >= 0; i--) {
//            for (int j = n[i].length - 1; j >= 0; j--) {
//                System.out.print(n[i][j]);
//            }
//        }
//
//    }


//What is the result?
//A. 3142
//B. 2413
//C. 1324
//D. 4231
// Answer: D


    //SECOND WAY:
    public static void main(String[] args) {

    int n[][] = {{1, 3}, {2, 4}};
        for(int i = n.length - 1; i >=0;i--) {  //2,4
        for (int y : n[i]) {   // 2,4, 1,3
            System.out.print(y);
        }
    }
}  }


//   ANSWER: 2413