import java.util.Scanner;

public class TestMethod4 {
	//정수 하나를 전달 받아 1~100사이의 수이면 true 아니면 false 메소드 작성
	public static boolean between (int a) {
		if (a >= 1 && a <= 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// 사용자 국 영수 점수 입력을 받아서 합과 평균을 출력해보세요 (입력값은 1~ 100 사이여야함)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int kor;
		int math;
		int eng;
		
		do {
			System.out.print("국어 성적을 입력하세요 : ");
			kor = scan.nextInt();
		} while (!(between(kor)));
		do {
			System.out.print("수학 성적을 입력하세요 : ");
			math = scan.nextInt();
		} while (!(between(math)));
		do {
			System.out.print("영어 성적을 입력하세요 : ");
			eng = scan.nextInt();
		} while (!(between(eng)));
		
		double sum = kor + math + eng;	
		double avg = sum / 3;
		
			System.out.println("입력한 점수 : " + kor +" "+ math +" " + eng);
			System.out.println("각 성적의 합 : " + sum);
			System.out.println("각 성적의 평균 : " + avg);
				
		}
	}