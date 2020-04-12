package Q_1_60;

import java.util.ArrayList;
import java.util.List;

public class Q41 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
            names.remove("John");
        }
        System.out.println(names);
    }

}
//What is the result?
//A.	[Robb, Rick, Bran]
//B.	[Robb, Rick]
//C.	[Robb, Bran, Rick, Bran]
//D.	An exception is thrown at runtime.
//Answer A