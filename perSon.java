public abstract class Person {
	protected int age;
	protected String name, address;
	protected Occupation o;
	protected Student s;
	
	public enum Occupation {
		STUDENT,
		INSTRUCTOR
	}
	
	public Person(String name, int age, String address, Occupation o) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.o = o;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Occupation getOccupation() {
		return o;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setOccupation(Occupation o) {
		this.o = o;
	}
	
	public String greetings(Person p) {
		return "null";
	}
	
	public String greetings() {
		return "null";
	}
}
