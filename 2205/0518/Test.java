//사용자에게 국어, 영어, 수학 점수를 정수로 입력받아 총점과 평균점수를 출력하는 프로그램
import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		int sum;
		int avg;
		
		System.out.print("국어 점수를 입력하세요: ");
		kor = input.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		eng = input.nextInt();
		
		System.out.print("수학 점수를 입력하세요: ");
		math = input.nextInt();


		sum = kor + eng + math;
		avg = sum / 3;
		
		System.out.print("총점 : " + sum + " 평균 : " + avg);
	}
}