

public class Child extends Parent{

	void display() throws RuntimeException {
		System.out.println("Inside Child display()...");
	}
	
	public static void main(String[] args) throws Exception {
		
		Parent p = new Child();
		p.display();
	}

}
