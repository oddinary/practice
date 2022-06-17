
class BankruptException extends RuntimeException {
	private int lack;
	public BankruptException(String message, int lack) {
		super(message + Math.abs(lack) + "원 부족합니다.");
	}
}

public class Account {
	int balance;

	public int getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금했습니다.");
		System.out.println("잔고" + balance + "원");
	}

	public void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
			System.out.println(money + "원 출금 했습니다.");
		} else {
			throw new BankruptException("출금 할 수 없습니다.", balance - money);
		}
		System.out.println("잔고" + balance + "원");
	}
}
