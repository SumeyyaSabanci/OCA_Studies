package Q_157_181;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q168 {

	public static void main(String[] args) {

	//bizim yazdigimiz
//	if (arrList.removeIf(s ->{return s.length()<=2;})){
//		System.out.println( + "removed");
//	}

//soruda bu sekilde:
		String[] arr= {"Hiw", "Hw", "Ae","You"};
		List<String> arrList= new ArrayList<>(Arrays.asList(arr));
		if (arrList.removeIf((String s) ->{ return s.length()<=2;}))
		{
			System.out.println("removed");
		}else{
			System.out.println("not removed");
		}

		//bizim yazdigimiz
//	if (arrList.removeIf(s ->{return s.length()<=2;})){
//		System.out.println( arrList+ "removed");
//	}

    }
}

	/*
	 
		 What is the result?   Answer: A
		
		A. Compilation fails.
		B. Hi removed
		C. An UnsupportedOperationException is thrown at runtime.
		D. The program compiles, but it prints nothing.


	ibrah note: my code didnt have compile error.
                 i dont remember answer.
               change was (String s) was switched with only s.
                eclipse sout(“removed”)

	 */

	


