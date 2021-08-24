
public class EngStud extends Stud {
	
	private String branch;
	private int sem;
	
	public static void main(String args[]) {
		EngStud s=new EngStud();
		s.setPersonalInfo(111, "AAA");
		s.setEngInfo("CS", 3);
		s.showPersonalInfo();
		s.showEngInfo();
		s.result(49);
	}
	
	public void setEngInfo(String a, int b) {
		branch=a;		sem=b;
	}
	public void showEngInfo() {
		System.out.println(branch+","+sem);
	}
}
