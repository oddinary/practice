// 사용자가 몇개의 정수를 입력할지 먼저 정한 후
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수와 홀수를 분류해서 각각의 합과 평균을 구해보자.
// 입력받은 수를 짝수인지 홀수 인지 분류한다.
// 각각의 합과 평균을 구한다.
import java.util.Scanner;
public class SumOddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.print("몇개의 정수를 입력하시겠습니까?");
		int a = scan.nextInt();
		System.out.print("정수를 입력하세요");
		
		double sumEven = 0;
		double sumOdd = 0;
		int countEven = 0;
		int	countOdd = 0;
		//계산
		for (int i = 0; i < a; i++) {
			int num = scan.nextInt();
			if (num % 2 == 0){
			countEven++; // 1씩 더해준다.
			sumEven += num;
			}
			else {
			countOdd++;
			sumOdd += num;
			}
		}
		//출력
		System.out.println("짝수의 합 " + sumEven);
		System.out.println("짝수의 평균 " + (sumEven / countEven));
		System.out.println("홀수의 합 " + sumOdd);		
		System.out.println("홀수의 평균 " + (sumOdd / countOdd));
		
	}
}