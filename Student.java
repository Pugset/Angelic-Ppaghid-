public class Student extends Person {
	private String course;
	
	public Student(String name, int age, String address, String course) {
		super(name, age, address, Occupation.STUDENT);
		this.course = course;
		this.s = this;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String greetings(Person p) {
		return "Good Morning Teacher " + p.getName();
	}
}
