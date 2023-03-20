import java.util.Scanner;

public class VoteCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age to check vote eligibility ");
		int age = sc.nextInt();
		if(age<18) {
			throw new AgeNotFoundException("you are not eligible to Vote");
		}else {
			System.out.println("you are  eligible to Vote");
		}
	}

}
