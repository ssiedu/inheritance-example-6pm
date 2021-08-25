abstract class Trial {
	void m1() {
		System.out.println("m1 from parent called...!");
	}
	void m2() {
		System.out.println("m2 from parent called...!");
	}
	abstract void m3();
	abstract void m4();
}
abstract class Sample extends Trial {
	void m3() {
		System.out.println("m3 from child called...!");
	}
	abstract void m5();
}
class Check extends Sample {
	void m4() {
		System.out.println("m4 from grand-child called...!");
	}
	void m5() {
		System.out.println("m5 from grand-child called...!");
	}
}

public class AbstractExampleOne {

	public static void main(String[] args) {
		//Trial t=new Trial();
		//Sample ob=new Sample();
		Check ob=new Check();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
		ob.m5();
	}

}
