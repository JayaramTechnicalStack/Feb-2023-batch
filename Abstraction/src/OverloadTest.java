
public class OverloadTest {

	
	public int sum(int x , int y) {

		return x+y; //30
	}
	
	public int sum(int x, int y, int z) {
		
		return x+y+z;
	}
	
	
	public static void main(String[] args) {
	
		
		OverloadTest t = new OverloadTest();
		int result = t.sum(10,20); //30
		
	  System.out.println("Sum of two values are :"+result);
		int three = t.sum(10,40,20);
		
		System.out.println("Sum of three values are :"+three);
		
	}

}
