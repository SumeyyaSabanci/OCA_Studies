package Q_85_127.p2;

public class CheckingAccount {
    public int amount;
    // line n1
}

//And given this main method, located in another class:
/*
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount();
        // line n2
    }
 */

// Which three pieces of code, when inserted independetly, set the value of amount to 100?
/*
A. At line n1 insert:
    public CheckingAccount(){
       amount = 100;
       }

B. At line n2 insert:
      this.amount = 100;

C. At line n2 insert:
       amount = 100;

D. At line n1 insert:
       public CheckingAccount(){
         this.amount = 100;
         }
E. At line n2 insert:
      acct.amount = 100;

F. At line n1 insert:
      public CheckingAccount(){
          acct.amount = 100;
     }

     Answer: D and E

 */

// 2nd version --> soru ayni cevap anahtari farkli

/*
A. At line n2 insert:
       amount = 100;
       }

B. At line n2 insert:
      This.amount = 100;

C. At line n2 insert:
      acct.amount = 100;

D. At line n1 insert:
       public CheckingAccount(){
         amount = 100;
         }
E. At line n1 insert:
      public CheckingAccount(){
      this.amount = 100;

F. At line n1 insert:
      public CheckingAccount(){
          acct.amount = 100;

Answer : BCE
 */










