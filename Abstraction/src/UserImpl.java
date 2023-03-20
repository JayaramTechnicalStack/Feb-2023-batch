import java.util.Scanner;

public class UserImpl extends User{

	@Override
	void login(String userName, String passWord) { // 3 userName = Ajay passWord= Welcome@123
		
		if(userName.equals("Ajay")  && passWord.equals("welcome@123")) {
			
			System.out.println("Login Successfully !");
		}else {
			System.out.println("UserName and Password is Wrong !.. Please try again");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String userName = sc.next(); 
		
		System.out.println("Enter Password:");
		String passWord = sc.next();
		
		User user = new UserImpl(); // 1
		
		user.login(userName ,passWord);  //2 
		user.show();
	}

}
