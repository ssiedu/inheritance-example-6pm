
public class Test {

	public static void show(final int p) {	//p is now a read-only parameter, we can just read it but cant change.
		System.out.println(p);
		//p++;
		System.out.println(p);
	}
	public static void main(String[] args) {
		show(10);
	}

}
