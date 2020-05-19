package Q_61_84;

public class Q82 {
}
class Test1 {
    public static void main(String[] args) {

        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i =97;

        for (int a =0 ; a<chs.length; a++){
            for (int b=0; b<chs.length;  b++){
                chs[a][b] = ""+i;
                i++;
            }
        }

        for (String[] cs : chs){
            for(String c :cs){
                System.out.print(c + " ");
            }
            System.out.println();
        }
//deneme
//        String[][] chs = new String[2][];
//        chs[0] = new String[2];
//        chs[1] = new String[1];
//        int i =97;
//
//        for (int a =0 ; a<chs.length; a++){
//            for (int b=0; b<chs.length;  b++){
//                chs[a][b] = ""+i;
//                i++;
//            }
//        }
//
//        for (String[] cs : chs){
//            for(String c :cs){
//                System.out.print(c + " ");
//            }
//            System.out.println();
//        }
    }
}

//Answer A
// 97 98
// 99 100 null null null