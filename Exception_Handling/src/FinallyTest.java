import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a vaue");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		try {
		// create database connection 
			System.out.println(a/b);
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("inside finally"); 
			// close database connection
		}
	}

}
