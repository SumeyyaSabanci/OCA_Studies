package Q_1_60;

public class Q24 {

	public static void main(String[] args) {
		// Given the code fragment
		String[] strs=new String[2];
		int idx=0;
//		strs[0] = "A";
//		strs[1]="B";
	//	System.out.println(strs[0].concat("element "));  //we can not concat if array is null


		for (String s : strs) {
			strs[idx].concat("element "+idx);
			idx++;
		}

		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
		/*
		 * What is the output?
		 * A. Element 0Element 1
		 * B. Null element 0Nullelement 1
		 * C. NullNull
		 * D. A null pointer exception is thrown at runtime.
		 */

	}

}
