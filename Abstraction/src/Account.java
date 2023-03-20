
public class Account {

	private int accountId;
	private String accountHodlerName;
	private Double amount;
	private String bankName;
	private String ifscCode;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHodlerName() {
		return accountHodlerName;
	}

	public void setAccountHodlerName(String accountHodlerName) {
		this.accountHodlerName = accountHodlerName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	/*
	 * public Account() { System.out.println("inside default Account Constructor");
	 * }
	 * 
	 * 
	 * 
	 * 
	 * public Account(int accountId, String accountHodlerName, Double amount, String
	 * bankName, String ifscCode) { this(); this.accountId = accountId;
	 * this.accountHodlerName = accountHodlerName; this.amount = amount;
	 * this.bankName = bankName; this.ifscCode = ifscCode; }
	 */
	
	public static void main(String[] args) {

		Account acc = new Account();
		acc.setAccountId(4567);
		acc.setAccountHodlerName("Ajay");
		acc.setAmount(505.45);
		acc.setBankName("Axis");
		acc.setIfscCode("AXIS0002");

		System.out.println("Account Id is :" + acc.getAccountId());
		System.out.println("Account Name is :" + acc.getAccountHodlerName());
		System.out.println("Account Balance  is :" + acc.getAmount());
		System.out.println("Account Bank Name  is :" + acc.getBankName());
		System.out.println("Account IfscCode is :" + acc.getIfscCode());

		/*
		 * System.out.println("Account Object Info : "+acc.getAccountId() +
		 * "Account Name :" +acc.getAccountHodlerName() + "Account Bank Name is :" +
		 * ""+acc.getBankName() + "Account Balance is :" +acc.getAmount()
		 * +"IFSCCODE is :"+acc.getIfscCode() );
		 */

	}

}
