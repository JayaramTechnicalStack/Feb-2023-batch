
public class ConTest {

	public ConTest() {
		System.out.println("Inside Default Constructor...");
	}
	
	public ConTest(int a) {
		this();
		System.out.println("a value is :"+a);
	}
	
	public ConTest(int a , int b) {
		this(10);
		System.out.println("sum of two values are :" +(a+b));
	}
	
	public ConTest(int a , int b, int c) {
	   this(10,20);
		System.out.println("sum of three values are :" +(a+b+c));
	} 
	
	public static void main(String[] args) {
		
		
		ConTest test = new ConTest(10,20);

	}

}
