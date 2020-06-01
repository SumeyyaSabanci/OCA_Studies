package Q_128_156;

public class Q142 {
}


//interface Readable {
//    public void readBook();
//
//    public void setBookMark();
//}
//
//abstract class Book implements Readable {    //line n1
//    public void readBook() {
//        // line n2
//    }
//
//    class EBook extends Book {    //line n3
//        public void readBook() {
//        }
//        //line n4
//    }
//
//    @Override
//    public void setBookMark() {
//    }
//}


/*
A-Replace the code fragment at line n1 with; class Book implements Readable{
B- At line n2 insert; public abstract void setBookMark();
C- Replace the code fragment at line n3 with; abstract class EBook extends Book{
D- At line n4 insert; public void setBookmark(){

A. Option A
B. Option B
C. Option C
D. Option D

Answer: D

Second version :same question

Third version: question same but options are different
 */
interface Readable{
        public void readBook();
        public void setBookMark();
    }
    abstract class  Book implements  Readable {    //line n1
        public void readBook() {} // line n2


    }
       class EBook extends  Book {    //line n3
            public void readBook() {
            }
           //line 4
           public void setBookMark(){}
        }


/*
A-Replace the code fragment at line n3 with; abstract class EBook extends Book{
B- Replace the code fragment at line n1 with; class Book implements Readable{
C-  At line n2 insert; public abstract void setBookMark();
D- At line n4 insert; public void setBookmark(){}

A. Option A
B. Option B
C. Option C
D. Option D

Answer A

*/