package 자바_예외처리의이해;

public class account {
	private int balance;
	public account(int _balance) {
		balance = _balance;
	}
	public int withdraw(int _money) { // 돈을 출금하는 함수
		if(balance < _money) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
			balance -= _money;
		}
		return balance;
	}
}
