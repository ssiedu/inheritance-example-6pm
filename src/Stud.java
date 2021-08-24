
public  class Stud {
	private int rno;
	private String name;
	private final int PASS_MARKS=33;
	
	public  void result(int marks) {
		
		if(marks>=33) {
			System.out.println("Student Passed...!");
		}else {
			System.out.println("Student Failed...!");
		}
	}
	public void setPersonalInfo(int a, String b) {
		rno=a;
		name=b;
	}
	public void showPersonalInfo() {
		System.out.println(rno+","+name);
	}
}
