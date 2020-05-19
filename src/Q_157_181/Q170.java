package Q_157_181;


 class MyString {
    String msg;

//    public String test(){
//
//        return "test";
//    }

    MyString(String msg) {
        this.msg = msg;
    }
}
public class Q170 {
    public static void main(String[] args) {

        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8").msg);

//bizim example
//        System.out.println("Hello "+ new MyString("Java SE 8").test());
//    }


    }
}
/*
A) Hello Java SE 8
   Hello Java SE 8

B) Hello java.lang.StringBuilder@<<hashcode1>>
   Hello p1.MyString@<<hashcode2>>

C) Hello Java SE 8
   Hello p1.MyString@<<hashcode>>

D) Compilation fails at the Test class

Dogru sik:A
 */