package Q_85_127;

//public class Q109 {
//}
class Vowel {
    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
       Vowel obj1 = new Vowel();
       Vowel obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';
        System.out.println(var1 + ", " + var2);
        System.out.print(obj1.var + ", " + obj2.var);



        //biz degistirdik
//        char var1 = 'a';
//        char var2 = var1;
//        var2 = 'e';
//        Vowel obj1 = new Vowel();
//        Vowel obj2 = obj1;
//        obj1.var = 'o';
//        obj2.var = 'i';
//        System.out.println(var1 + ", " + var2);
//        System.out.print(obj1.var + ", " + obj2.var);
    }
}
/*
* What is the result?
A. a, ei, i
B. a, eo, o
C. e, ei, i
D. a, ao, o
Answer: A
* */

/* Second option--> obj1.var ile obj2.var degerleri yer degistirmis dolasiyla sorunun cevabida degismis
* public class Vowel {
        private char var;

        public static void main(String[] args) {
            char var1 = 'a';
            char var2 = var1;
            var2 = 'e';
            Vowel obj1 = new Vowel();
            Vowel obj2 = obj1;
            obj1.var = 'i';
            obj2.var = 'o';
            System.out.println(var1 + ", " + var2);
            System.out.print(obj1.var + ", " + obj2.var);
        }
    }
    *
 * What is the result?
A. e, ei, o
B. a, ei, o
C. a,eo, o
D. e, eo, o
* Answer: C
* */

