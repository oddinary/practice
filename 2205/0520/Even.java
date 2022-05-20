import java.util.Scanner;

//정수를 입력받아 짝수면 짝수입니다 홀수면 홀수입니다.출력하기

public class Even{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// if (조건식) {
			// //문장1
		// } else {
			// //문장2
		// }
			// //문장3	
		// if가 참일경우 문장1, 문장3 수행, 거짓일경우 문장2, 문장3 수행
		
		System.out.print("홀짝 판별기 : ");
		int IsEven = scan.nextInt();
		
		if (IsEven % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		if (IsEven % 2 != 0) {
			System.out.println("홀수입니다.");
		}		
				
		System.out.println("끝");
	}
}