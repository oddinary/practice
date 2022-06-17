
public class Main2 {
	public static void main(String[] args) {
		// 여러개의 예외가 발생할경우 try catch에서 어떻게 해결해야할까??
		String s = null;
		try {
			
			int div = 10 / 0; //예외가 발생! 예외를 만나는 순간 catch로 넘어가기 때문에
			s.equals("asdf"); // 이후의 문장은 실행 되지 않음
			
			System.out.println("실행되나?"); 
//		} catch (NullPointerException e) { e는 catch문 안에만 존재하는 지역변수
//			System.out.println("널 포인트 익셉션 처리");
//		} catch (ArithmeticException e) { // 이렇게 여러번의 catch문으로 처리 해줄 경우에는 이 이외의 예외는 처리할 수 없다. 
//			System.out.println("수 익셉션 처리"); // 그리고 문장이 더러워 진다. 지역변수 범위도 확인해줘야하고 어려워짐.
		
		} catch (Exception e) { // 각종 예외들은 exception을 상속하기 때문에 이렇게 묶어서 처리해 줄 수있다. 
			System.out.println("모든 예외는 여기서 잡힙니다.");
		} // catch (NullPointerException e) { 부모를 밑에 둬야 컴파일 에러가 안난다.
//		System.out.println("널 포인트 익셉션 처리");
		System.out.println("정상 종료");
	}
}
