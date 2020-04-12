package Q_128_156;
class ElectricAccount{
	private double kWh;
	private double rate;
	private double bill;
	public void addKWh(double kWh) {
		if(kWh>0) {
			this.kWh+=kWh;
			this.bill*=this.rate;
		}
		
	}
	
	
}
public class Q151_Customer {
	ElectricAccount acct=new ElectricAccount();
	public void useElectricity(double kWh) {
		acct.addKWh(kWh);
	}

}
