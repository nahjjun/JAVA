package 자바_예외처리의이해;

public class ExceptionAssist {
	public static void main(String[] args) {
		account myAccount = new account(100000);
		
		System.out.println(myAccount.withdraw(50000));
		System.out.println(myAccount.withdraw(60000));
		
	}
}
