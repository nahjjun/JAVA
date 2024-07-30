package 자바_예외처리의이해;

public class account2 {
	private int balance;
	public account2(int _balance) {
		balance = _balance;
	}
	public int withdraw(int _money) throws OverdraftException { // 돈을 출금하는 함수
		if(balance < _money) {
			throw new OverdraftException("잔액이 부족합니다."); // 만들어놨던 사용자 정의 Exception 클래스를 new로 생성시켜서 throw 해준다.
		}
		balance -= _money;
		return balance;
	}
}
