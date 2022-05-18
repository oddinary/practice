import java.util.Scanner;//Scanner 클래스 포함

public class Add2{
	//메인 메소드에서 부터 실행이 시작된다.
	public static void main(String[] ags){
		//사용자로부터 입력을 받기위해 Scanner(입력을 받기위한 클래스)의 Instance를 생성한다.
		//한문장으로 선언과 초기화를 했음
		Scanner input = new Scanner(System.in); //변수 선언. Scanner라는 클래스의 타입에 input이라는 이름의 변수를 선언함
		
		int x;
		int y;
		int sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: ");//입력 안내 출력
		x = input.nextInt();// input안의 nextInt라는 method호출(사용자로부터 첫 번째 숫자를 읽는다.)
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
	}
}