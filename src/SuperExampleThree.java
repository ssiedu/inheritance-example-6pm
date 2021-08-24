class Person {
	private String name;
	private String address;
	public Person(String s1, String s2) {
		name=s1; address=s2;
	}
	public void info() {
		System.out.println("Name    : "+name);
		System.out.println("Address : "+address);
	}
}
class Emp extends Person {
	private String desg;
	private int sal;
	public Emp(String s1, String s2, String s3, int i) {
		super(s1,s2);
		desg=s3;
		sal=i;
	}
	public void info() {
		super.info();
		System.out.println("Desg    : "+desg);
		System.out.println("Salary  : "+sal);
	}
}



public class SuperExampleThree {

	public static void main(String[] args) {
		Emp e=new Emp("Amit","Indore","Manager",90000);
		e.info();

	}

}
