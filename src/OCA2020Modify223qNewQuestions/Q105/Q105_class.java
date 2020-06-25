package OCA2020Modify223qNewQuestions.Q105;

public class Q105_class {
    public static void main(String[] args) {

        //A
        // Bird p=new Peacock();  //sadece fly gorunur oluyor

        //B
        //  Bird b = new Bird();
        //   Peacock p= (Peacock) b;

        //C
        //  Peacock b = new Peacock();
        //  Bird p = (Bird) b;

        //D
        Bird b=new Peacock();
        Peacock p =(Peacock) b;

    /*
    insert code snippet here
     */
        p.fly();
        p.dance();

        //  which code snippet can be inserted to print Fly.Dance?
    }
}