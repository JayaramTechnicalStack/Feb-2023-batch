
public class StaticTest {
 static int i ;
	 
	static {
		
		System.out.println(i);
	}

	static {
		System.out.println("I'm from static block ");
	}
	
	
	
	public  static void getMessage() {
		i=10;
		System.out.println("Good Evening !!!");
	}

	public  void main(String[] args) {
		// TODO Auto-generated method stub
	
		StaticTest.getMessage();
	}
		
}
