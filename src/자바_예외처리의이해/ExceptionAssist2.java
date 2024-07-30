package 자바_예외처리의이해;

public class ExceptionAssist2 {
	public static void main(String[] args) {
		account2 myAccount = new account2(100000);
		
		try {
			System.out.println(myAccount.withdraw(50000));
			System.out.println(myAccount.withdraw(60000));
		}catch(OverdraftException e) {
			e.printStackTrace();
		}
	}
}
