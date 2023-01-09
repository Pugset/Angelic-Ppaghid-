public class SeniorCustomer extends Customer {

	public static final double discount = 0.20;

	public SeniorCustomer(String name, double amount) {
		super(name, amount);
	}

	@Override
	public double calculateBill() {
		return amount - (amount * discount);
	}
	
}
