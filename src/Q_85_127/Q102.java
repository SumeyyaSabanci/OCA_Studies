package Q_85_127;

public class Q102 {
}
class CheckingAccount {
    public int amount;
    //line n1
}

class another {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount();
        //line n2
    }
}

/*
    Which three pieces of code, when inserted independently, set the value of amount to 100?
      A) At line n2 insert:
            amount = 100;
      B) At line n2 insert:
            This.amount = 100;
      C) At line n2 insert:
            acct.amount = 100;
      D) At line n1 insert:
            public CheckingAccount(){
            amount =100;
            }
      E) At line n1 insert:
            public CheckingAccount(){
            this.amount=100;
            }

      F) At line n1 insert:
            public CheckingAccount() {
            acct.amount= 100;
            }
 */