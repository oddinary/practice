import java.util.Scanner;

public class Hakjum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//10점 단위로 점점 떨어지게 만들자
		System.out.print("학점을 입력하세요 : ");
		int score = scan.nextInt();
		String hakjum;
		if (score >= 90) {
			hakjum = "A";
		} else if (score >= 80) {
			hakjum = "B";
		} else if (score >= 70) {
			hakjum = "C";
		} else if (score >= 60) {
			hakjum = "D";
		} else {
			hakjum = "F";
		}
		System.out.println("당신의 학점은 " + hakjum +"입니다.");
	}
}