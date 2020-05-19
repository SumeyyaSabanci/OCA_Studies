package Q_1_60;

public class Q47 {
    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String s : strs){
            strs[idx].concat(" element "+idx);  //concat yapiyor ama initilaze yapmadigi icin etkilemez.
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }
    }

}
//What is the result?
//A.	AB
//B.	A element 0B element 1
//C.	A NullPointerException is thrown at runtime.
//D.	A 0B 1
//Answer: C

//second version

//    public static void main(String[] args) {
//        String[] strs = new String[2];
//        int idx = 0;
//        for (String s : strs){
//            strs[idx].concat(" element "+idx);
//            idx++;
//        }
//        for (idx = 0; idx < strs.length; idx++){
//            System.out.println(strs[idx]);
//        }
//    }
//}

//third version
//public static void main(String[] args) {
//    String[] strs = new String[2];
//    int idx = 0;
//    for (String s : strs){
//        strs[idx]=(" element "+idx);
//        idx++;
//    }
//    for (idx = 0; idx < strs.length; idx++){
//        System.out.println(strs[idx]);
//    }
//}
//}