
public class MEStud extends EngStud {

	private String rtopic;
	
	public void setRTopic(String s) {
		rtopic=s;
	}
	public void showRTopic() {
		System.out.println(rtopic);
	}
	
	public static void main(String[] args) {
		MEStud s=new MEStud();
		s.setPersonalInfo(111, "AAA");	//Stud
		s.setEngInfo("CS", 3);			//EngStud
		s.setRTopic("CSApp");			//MEStud
		s.showPersonalInfo();
		s.showEngInfo();
		s.showRTopic();

	}

}
