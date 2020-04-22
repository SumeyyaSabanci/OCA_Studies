package Q_157_181;

public class Q164 {

	public static void main(String[] args) {
//	int data[] = {2010, 2013, 2014, 2015, 2014};
//	int key = 2014;
//	int count =0;
//	for (int e:data) {
//		if(e !=key) {
//			continue;  // continue dan sonra kod yazarsak hata veriyor.
//	//		count++;     //it is not reachable code
//		}
//	}
//		System.out.println(count+" found");

		int data[] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count =0;
		for (int e:data) {
			if(e !=key) {
				continue;
			}
			count++;
		}
		System.out.println(count+" found");

	
	}


	/*
			What is the result?

			A. Compilation fails.
			B. 0 Found
			C. 1 Found
			D. 3 Found
			Answer: A
	 */
	}
