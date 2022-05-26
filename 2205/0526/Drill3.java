// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.
import java.util.Scanner;

public class Drill3 {
	public static int length(String left, String right) {
		return left.length() + right.length();	
	}
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		System.out.print("왼쪽단어를 입력하세요: ");
		String left = scan.nextLine();
		System.out.print("오른쪽단어를 입력하세요: ");
		String right = scan.nextLine();
	
	
	System.out.println(left + right);
	System.out.println(length(left, right));
	}
}