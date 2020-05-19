package Q_61_84;

public class Q64 {
//    public static void main(String[] args) {
//        String[] arr = {"A", "B", "C", "D"};
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arr[i] + " ");
//            if (arr[i].equals("C")) {
//                continue;
//            }
//            System.out.println("Work done");
//           break;
//        }
//    }


    // cevap: A Work done
    //Baska bir sekilde sorulmus continue ve break in yeri degistirilmis ve cevap:A B C Work done

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
            if (arr[i].equals("C")) {
                break;
            }
            System.out.println("Work done");
            continue;
        }
    }

}
