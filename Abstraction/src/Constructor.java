
public class Constructor {

	public Constructor() {
		System.out.println("inside default constructor");
	}
	public Constructor(int x) {
		System.out.println("inside parameter constructor :"+x);
	}
	
	
	public static void main(String[] args) {
		
		Constructor defult = new Constructor();
		
		Constructor parameter = new Constructor(10);
		
	}

}
