//정수 2개와 연산자(문자열) 등을 입력받아 사칙연산을 수행하는 계산기 프로그램
import java.util.Scanner;

public class Calc{
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		scan.nextLine();
		String calc = scan.nextLine();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = scan.nextInt();
		
		String result;
		
		result = "연산자를 입력하세요";
		
		if (calc.equals("+") || calc.equals("-") || calc.equals("*") || calc.equals("/")) {
			if (calc.equals("+")) {
				result = String.valueOf(a + b);	
			} else if (calc.equals("-")) {
				result = String.valueOf(a - b);	
			} else if (calc.equals("*")) {
				result = String.valueOf(a * b);	
			} else if (calc.equals("/")) {
				result = String.valueOf(a / b);	
			} 
		} else {
				// result = "연산자를 입력하세요";
			}
		
		System.out.print("계산결과 : " + result);
		
		// if (calc.equals("+") || calc.equals("-") || calc.equals("*") || calc.equals("/")) {
			// if (calc.equals("+")) {
				// result = String.valueOf(a + b);	
				// System.out.print("계산결과 : " + result);		
			// } else if (calc.equals("-")) {
				// result = String.valueOf(a - b);	
				// System.out.print("계산결과 : " + result);
			// } else if (calc.equals("*")) {
				// result = String.valueOf(a * b);	
				// System.out.print("계산결과 : " + result);
			// } else if (calc.equals("/")) {
				// result = String.valueOf(a / b);	
				// System.out.print("계산결과 : " + result);
			// } 
		// } else {
				// result = "연산자를 입력하세요";
				// System.out.print("계산결과 : " + result);
			// }
		
		
	}
}