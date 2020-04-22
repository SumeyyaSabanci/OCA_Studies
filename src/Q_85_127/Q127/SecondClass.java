package Q_85_127.Q127;

public class SecondClass {

    public static void main(String[] args) {

        CheckingAccount acct = new CheckingAccount();
        //line n2
    //    CheckingAccount.amount = 100;
    //    amount=100;

        acct.amount = 100;
     System.out.println(acct.amount);
     //   this.amount=100;



    }
}
/*
//Which three pieces of code, when inserted independently, set the value of amount to 100?
     //A
//At line n1 insert
public CheckingAccount(){
      amount = 100;
     }

//B
//At line n2 insert
   this.amount = 100;

//C
//At line n2 insert
   amount = 100;

//D
//At line n1 insert
public CheckingAccount(){
        this.amount = 100;
        }
//E
//At line n2 insert
        acct.amount = 100;
//F
//At line n1 insert
public CheckingAccount(){
        acct.amount = 100;
        }

 */
//A D E