package Q_85_127;

public class Q100 {
}
/*
        How should you write methods in the ElectricAccount class at line n1 so that the member variable bill is
        always equal to the value of the member variable kwh multiplied by the member variable rate?
        Any amount of electricity used by a customer (represented by an instance of the customer class) must
        contribute to the customer's bill (represented by the member variable bill) through the method use
        Electricity method. An instance of the customer class should never be able to tamper with or decrease the
        value of the member variable bill.
 */

class Customer {
    ElectricAccount acct = new ElectricAccount();

    public void  useElectricty(double kWh){
        //  acct.addKwh(kWh);
    }
}

class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    //line n1
}


/*

        A) public void addKWh(double kWh){
            this.kWh +=kWh;
            this.bill = this.kWh*this.rate;
        }

        B) public void addKWh(double kWh){
            if(kWh>0){
                this.kWh +=kWh;
                this.bill = this.kWh*this.rate;
            }
        }

        C) public void addKWh(double kWh){
            if(kWh>0){
            this.kWh +=kWh;
            this.bill = this.kWh*this.rate;
        }

        D) public void addKWh(double kWh){
            if (kWh > 0) {
                this.kWh += kWh;
                setBill(this.kWh);
            }
        }
           public void setBill(double kWh){
               bill = kWh*rate;
           }
     */