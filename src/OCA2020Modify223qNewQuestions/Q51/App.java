package OCA2020Modify223qNewQuestions.Q51;

class LogFileException extends Exception{}

class AccessViolationException extends RuntimeException {}

public class App {
    public static void main(String[] args) throws LogFileException {
        App obj = new App();
        try{
            obj.process();
            obj.open();

            //insert code here
        }catch (Exception e){
            System.out.println("Completed");
        }
    }
    public void process()  throws LogFileException {  //throws LogFileException ekelendi yoksa hata veriyor
        System.out.println("Processed");
        throw new LogFileException();
    }
    public void open() {
        System.out.println("Opened");
        throw new AccessViolationException();
    }
    public void open1() throws Throwable {
        System.out.println("Opened");
        throw new Throwable();
    }
}