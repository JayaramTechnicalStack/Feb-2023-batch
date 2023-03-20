
public class Child extends Parent {
	
	public Child() {
		System.out.println("inside default constructor for child");
	}
	
	void show(){
		super.show();
		System.out.println("Inside Child.. ");
	}
	
	
	public static void main(String[] args) {
		
		
		  Parent p = new Child(); 
		  
		  p.show();
		 
		
		/*
		 * Parent p = new Child(); p.show(); // inside child..
		 */
		
		/*
		 * Child c = new Child(); c.show(); // Inside Child
		 */
		
		/*
		 * Child c = new Parent(); c.show(); // will get compileTime error
		 */
		
	}

}
