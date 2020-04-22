package Q_157_181;

public class Q176 {
}
class Student {
    String name;
    String age;
}
class Test {
    public static void main(String[] args) {

        Student s1 = new Student();  //sagdaki soldakine refer olur
        Student s2 = new Student();
        Student s3 = new Student();
        s1 = s3;
        s3 = s2;
        s2 = null;

    }

}
/*
A. After line 11, three objects are eligible for garbage collection.
B. After line 11, two objects are eligible for garbage collection.
C. After line 11, one object is eligible for garbage collection.
D. After line 11, none of the objects are eligible for garbage collection.
Answer: C
 */