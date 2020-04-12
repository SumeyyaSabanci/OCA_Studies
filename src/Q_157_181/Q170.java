package Q_157_181;

public class Q170 {

    public static void main(String[] args) {

        System.out.println("Hello "+ new StringBuilder(("Java SE 8")));
        System.out.println("Hello "+ new MyString("Java SE 8").msg);

    }

    static class MyString {
        String msg;

        MyString(String msg) {
            this.msg = msg;
        }
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