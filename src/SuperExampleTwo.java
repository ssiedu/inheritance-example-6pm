class X {
	/*
	X(){
		System.out.println("X-0");
	}
	*/
	X(int i){
		System.out.println("X-1");
	}
	X(int i, int j){
		System.out.println("X-2");
	}
}
class Y extends X {
	Y(){
		super(10);		//we are calling 1-int arg constructor 
		System.out.println("Y-0");
	}
	Y(int i){
		super(10,20);	//calling 2-int arg constructor
		System.out.println("Y-1");
	}
	Y(int i, int j){
		super(1);	//calling 1-int arg constructor
		System.out.println("Y-2");
	}
}

public class SuperExampleTwo {

	public static void main(String[] args) {
		
		Y ob=new Y(5,10);
		
	}

}
