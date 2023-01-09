public class RegularCustomer extends Customer {

	public RegularCustomer(String name, double amount) {
		super(name, amount);
	}

	@Override
	public double calculateBill() {
		return amount;
	}
	
}
