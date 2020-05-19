package Q_1_60.Q6;


import java.io.IOException;

class X {
    public void printFileContent() throws IOException {
        /*code goes here */
  //      throw  new IOException();
    }
}

public class Test8 {
    public static void main(String[] args) throws Exception{
       X xobj = new X();
        xobj.printFileContent();
    }
}
/*
Which two modifications should you make so that the code compiles successfully? (Choose two.)
A.  Replace line 13 with:
try {
xobj.printFileContent();
}
catch.(Exception e) { }
catch (IOException e) { }

B. Replace line 7 with throw ("IOException raised");
C. Replace line 11 with public static main(String [] args) throws Exception{
D. At line 14, insert throw new IOException ();
E. Replace line 5 with public void printFileContetnt() throws IOException{

Answer :
C.Option C
E.Option E
 */

//answer might be AE