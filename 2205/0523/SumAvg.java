// 사용자가 몇개의 정수를 입력할지 먼저 정한 후
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수와 홀수를 분류해서 각각의 합과 평균을 구해보자.

import java.util.Scanner;
public class SumAvg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.print("몇개의 정수를 입력하시겠습니까?");
		int a = scan.nextInt();
		System.out.print("정수를 입력하세요");
		
		double sum = 0;
		//계산
		for (int i = 0; i < a; i++) {
			sum += scan.nextInt();
		}
		//출력
		System.out.println("합은 " + sum);
		System.out.println("평균은 " + sum / a);
		
	}
}