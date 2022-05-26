// 4. 키(실수, 미터)와 몸무게(실수, kg)를 전달받아 bmi지수(한국기준, 실수)구해 반환하는 메소드.
// bmi = 몸무게 / 키^2
import java.util.Scanner;

public class Drill4 {
	public static double bmi (double m, double kg) {
		return kg / (m * m);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 M단위로 입력하세요: ");
		double m = scan.nextDouble();
		System.out.print("몸무게를 kg단위로 입력하세요: ");
		double kg = scan.nextDouble();
		
		System.out.println(bmi(m, kg));
	}
}