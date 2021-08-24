class A {
	public void show() {
		System.out.println("hello from A...!");
	}
}

class B extends A {
	//class B has overridden show method of parent class A
	public void show() {
		System.out.println("hello from B...!");
	}
	
}

public class OverridingExample {

	public static void main(String[] args) {

		B ob=new B();
		//ob.show(5);

	}

}
