package OCA2020Modify223qNewQuestions;
import java.io.IOException;

class X{
    public void printFileContent() throws IOException{  // throws IOException yazılmazsa hata veriyor
        // codes goes here

        throw new IOException();

/* try catch blocla duzeltilmek istenirse ; throwları yazmaya gerek kalmaz
     try {
            throw new IOException();
        }catch (IOException e){ }
 */
    }
}

class Test {
    public static void main(String[] args) throws Exception{ // throws Exception ya da throws IOException yazılmazsa hata verir.
        X obj = new X();
        obj.printFileContent();
        System.out.println("deneme");
    }
}

public class Q190 {
}
