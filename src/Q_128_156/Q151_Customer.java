package Q_128_156;

class ElectricAccount{
	private double kWh;
	private double rate=0.07;
	private double bill;
	public void addKWh(double kWh) {
		if(kWh>0) {
			this.kWh+=kWh;
			this.bill= this.kWh*this.rate;
		}

	}
//	public void addKWh(double kWh){
//		if(kWh>0){
//		this.kWh +=kWh;
//		setBill(this.kWh);
//	}}
//	public void setBill(double kWh){
//		bill = kWh*rate;
//	}
	
}
public class Q151_Customer {
	ElectricAccount acct=new ElectricAccount();
	public void useElectricity(double kWh) {
		acct.addKWh(kWh);
	}

	public static void main(String[] args) {
		Q151_Customer obj = new Q151_Customer();
		obj.useElectricity(5);
	}

}
