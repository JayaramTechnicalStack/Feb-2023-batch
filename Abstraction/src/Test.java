
public class Test {

	public void show() {
		System.out.println("Inside Show()...");
	}
	
	public void show(int x) { // s
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		Test test = new Test();
		test.show();
		test.show(10);
	}

}
