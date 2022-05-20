import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();

		if (score >= 60) {
			System.out.println("합격");
	}	else {
			System.out.println("불합격 " + (60 - score) +"점 모자랍니다.");
			System.out.printf("%s %d", "부족한 점수", 60 - score);
	}
}
}