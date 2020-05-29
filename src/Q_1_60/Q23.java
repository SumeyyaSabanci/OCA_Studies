package Q_1_60;

public class Q23 {
//	int sum;
//	int b;
//
//	public int sum(){
//		return sum;
//	}



	public static void main(String[] args) {
		// given the code fragment
		int[] stack = { 10, 20, 30 };
		int size = 3;
		int idx = 0;

		// insert Answer code here
		do {
			idx++;
		} while (idx < size - 1);
		System.out.println("The Top Element: " + stack[idx]);


		/*
		 * A. do{idx++;}while(idx>=size); 
		 * B. while(idx<size){idx++;} 
		 * C. do{ idx++;}while(idx<size-1);  <--Answer
		 * D. do{idx++;} while(idx<=size);
		 * E. while(idx<=size-1){idx++;}
		 */

	}

}
