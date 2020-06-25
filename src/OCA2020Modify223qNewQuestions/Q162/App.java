package OCA2020Modify223qNewQuestions.Q162;

class E1 extends Exception{}

class E2 extends RuntimeException{}

public class App {
    public  void m1() throws Exception{   // throws Exception yazılmazsa hata veriyor
        System.out.println("m1.Accessed.");
        throw new E1();
    }

    public void m2(){
        System.out.println("m2.Accessed.");
        throw new E2();
    }

    public static void main(String[] args) throws Exception { // throws Exception yazılmazsa hata verir
        int level =1;
        App obj = new App();
        if(level <=5 && level >=3) {
            obj.m1();
        }else {
            obj.m2();
        }
    }
}