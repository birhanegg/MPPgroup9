package lesson4.prob2;

public final class PayCheck {

	private final double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;
	
	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	public double getNetPay() {
		return grossPay-(grossPay * (fica + state + local + medicare + socialSecurity));
	}
	public void print() {
		System.out.println("Paystub:\n" +
	      " Gross Pay: " + grossPay + "\n" +
				"Fica: " + fica + "\n" +
				"State: " + state + "\n" +
				"Local: " + local + "\n" +
				"Medicare: " + medicare + "\n" +
				"Social Security: " + socialSecurity +"\n"+
				"NET PAY: " + getNetPay()
	
				);
	}
	
}
