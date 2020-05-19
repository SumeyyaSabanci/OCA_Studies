package Q_128_156;
import java.util.ArrayList;
import java.util.List;
class Patient{
    String name;
    public Patient(String name){
        this.name=name;
    }
}
public class Q145 {
	 public static void main(String[] args) {
	        List ps=new ArrayList();
	        Patient p2=new Patient("Mike");
	        ps.add(p2);
   	     int f=ps.indexOf(p2);// f int tipinde bir degisken oldugunu f>=0 dan anliyoruz .
		                         // O zaman bize int donduren bir method
	                             // akla getirmeli oda indexOf(p2)tur bir elemanin indexsini bulur
		                        //  indexlerde integerdir
//		 int f= ps.indexOf(new Patient("Mike")); //object bos olmus olur
//		 Patient p=new Patient("Mike");
//		 int f = ps.indexOf(p);

	        if (f>=0){
	            System.out.println("Mike found");
	        }
	    }

}
