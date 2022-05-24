import java.util.Scanner;

public class SumNum5 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		//사용자가 입력한 5개 정수의 합 구하기.
		//입력
		System.out.println("5개의 정수를 입력하세요");
		int sum = 0;
		for (int i = 0; i < 5; i++){
			int num = scan.nextInt();
			//연산
			sum += num;
		}
		
		System.out.println(sum);
	}
}