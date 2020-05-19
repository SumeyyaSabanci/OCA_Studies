package Q_1_60;

public class Q25 {
    //in interface we can create in two ways abstract method 1)with abstrackt keyword. 2) without abstrackt keyword
    //when a class imp. an abstract class methods need to be initialize

}
interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {   //line n1
    public void readBook();
}

abstract class Book implements Readable {   //line n2
    public void readBook(){
        System.out.println("Read Book");
    }

}

class EBook extends Book {       //line n3
    public void download(){}
    public void readBook() {
        System.out.println("Read E-Book");
    }
}
//And given the code fragment:
//Book book1 = new EBook();
//book1.readBook();
/*


What is result?
A.Compilationfailsatlinen2.
B.ReadBook
C.ReadE-Book
D.Compilationfailsatlinen1
*/
//answer E

//we need to add absract method in nonabstract class
// public void download(){
//
//    }
