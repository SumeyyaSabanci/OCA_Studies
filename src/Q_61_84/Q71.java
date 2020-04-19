package Q_61_84;

public class Q71 {
    //What is the result
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};

        for (int[] a : arr){
            for (int i=0; i< arr.length; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    //cevap: 1 3
    //       1 3
}
