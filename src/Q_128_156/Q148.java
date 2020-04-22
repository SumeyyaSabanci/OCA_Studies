package Q_128_156;
/*
 ------
 |0|0| |
 ------
 | |x|0|
 -------
 |x| |X|
 
 */

public class Q148 {
	public static void main(String[] args) {
		char[][] grid=new char[3][3];
		grid[1][1]='x';
		grid[0][0]='o';
		grid[2][0]='x';
		grid[0][1]='o';
		grid[2][2]='x';
		grid[1][2]='o';
		grid[2][1]='x';//line n1
		
		for(char[]  gr:grid) {
			for(char g:gr) {
				System.out.print(g+" ");
			}
			System.out.println();
		}
		
	}
	

}
