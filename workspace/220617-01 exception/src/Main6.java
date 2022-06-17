//은행 계좌
// 필드 : 잔고(int)
// 메소드 : 입금(int) : void
// 		    출금(int) : void >> 출금액이 보유잔고 이상일때 예외 (부족한 금액이 얼마인지)를 발생시켜서 throws
//		  getter() : int
public class Main6 {
	public static void main(String[] args) {
		// 은행계좌 객체 생성
		// 입금/출금/게터 테스트
		// 출금 // 예외처리(메세지만 볼수있게)
		Account a = new Account();
		a.deposit(5000);
		a.withdraw(3000);
		try {
		a.withdraw(3000);
		} catch (BankruptException e) {
			System.out.println(e.getMessage());
		}
	}
}
