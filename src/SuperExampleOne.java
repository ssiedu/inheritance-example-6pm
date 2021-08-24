class P {
	int x=100;
	P(){
		System.out.println("parent-class-constructor...!");
	}
	void display() {
		System.out.println("hello from display of parent....!");
	}
}

class C extends P {
	//int x=200;
	C(){
		super();	//you are calling zero arg constructor of super class P
		System.out.println("child-class-constructor...!");
	}
	void display() {
		System.out.println("hello from display of child....!");
	}
	
	void show() {
		display();
		super.display();
		//System.out.println(x);
		//System.out.println(super.x);
	}
}



public class SuperExampleOne {

	public static void main(String[] args) {
		C ob=new C();
		ob.show();

	}

}
