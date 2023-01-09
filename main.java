public class Main {
	
	public static void main(String[] args) {
		Customer c;
		RegularCustomer r = new RegularCustomer("John Merry", 10.00);
		SeniorCustomer s = new SeniorCustomer("Levi Charles", 10.00);
		
		c = r;
		System.out.println(c.calculateBill());
		c = s;
		System.out.println(c.calculateBill());
	}
}
