import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a vaue");
			int a = sc.nextInt();
			System.out.println("Enter b value");
			int b = sc.nextInt();

			try {
				int c = a / b;
				System.out.println("Divison of two numbers are :" + c);
			} catch (ArithmeticException ae) {
				System.out.println("inside 1st catch");
				ae.printStackTrace();
			}
			try {
				String str = "Jay";
				System.out.println("Length of the String :" + str.length());
			} catch (NullPointerException n) {
				System.out.println("inside 2nd catch");
				n.printStackTrace();
			}

			try {
				int array[] = new int[5]; // 0,1,2,3,4
				array[3] = 10;
				System.out.println(array[3]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Im in side AIOB Exception catch block");
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println("inside 3rd catch");
			e.printStackTrace();
		}

		System.out.println("Hi");
		System.out.println("Good Evening to All !!!");

	}

}
