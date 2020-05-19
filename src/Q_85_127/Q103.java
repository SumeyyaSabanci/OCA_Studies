package Q_85_127;

public class Q103 {
}
class Student {
    String name;
    public Student(String name){
        this.name=name;
    }
}
class Test{
    public static void main(String[] args){

        Student [] students= new Student[3];
        students[1]=new Student("Richard");
        students[2]=new Student("Donald");
        for( Student s:students){
            System.out.println(" "+s.name);
        }
     }

//second way
//
//        Student [] students= new Student[3];
//        students[0]=new Student("Richard");
//        students[1]=new Student("Donald");
//        for( Student s:students){
//            System.out.println(" "+s.name);
//        }
//    }
}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/


