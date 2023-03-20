import java.util.Scanner;

public class AccountTest {
	
	

	public static void main(String[] args)  {
		
		SavingAccount ac = new SavingAccount();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your account No");
		int accoutNo =sc.nextInt();
		
		System.out.println("Enter Account Name");
		String accName= sc.next();
		
		System.out.println("Enter Account Status");
		String accStatus = sc.next();
		
		ac.setAccountNo(accoutNo);
		ac.setAccountName(accName);
		ac.setStatus(accStatus); 
		
		       // active.eqauls(active);               
		if(ac.getStatus().equals(AccountConstants.ACTIVE)) {
			
			 System.out.println("Your account is Active");
			 
		}else if(ac.getStatus().equals(AccountConstants.IN_ACTIVE)) {
			 System.out.println("Your account is inActive");
		}
		else if(ac.getStatus().equals(AccountConstants.LOCK)) {
			 System.out.println("Your account is locked");
		}else {
			System.out.println("Status is not listed in our bank");
		}
	}

}
