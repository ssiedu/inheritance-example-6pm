

public class MediStud extends Stud{

	private String specialization;
	private int prof;
	
	public void result(int marks) {
		if(marks>=50) {
			System.out.println("Medical Student Passed...!");
		}else {
			System.out.println("Medical Student Failed...!");
		}
	}
	
	public void showMediInfo() {
		System.out.println(specialization+","+prof);
	}
	public void setMediInfo(String a, int b) {
		specialization=a;
		prof=b;
	}
	public static void main(String[] args) {
		MediStud s=new MediStud();
		s.setPersonalInfo(111, "AAA");
		s.setMediInfo("Ortho", 2);
		s.showPersonalInfo();
		s.showMediInfo();
		s.result(48);

	}

}
