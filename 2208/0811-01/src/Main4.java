import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		
		Pattern p = Pattern.compile("[a-z]{9}");
		Matcher m = p.matcher(line1);
		// 해당 정규표현식과 비교하는 문자열이 일치하면 true
		System.out.println(m.matches());
		
		Pattern p1 = Pattern.compile("[0-9a-z]{6}");
		Matcher m1 = p1.matcher(line3);
		System.out.println(m1.matches());
		
		// 아이디는 영소문자와 숫자로 이루어져야하고 최소 6자 최대 12자입니다.(영문자로 시작해야합니다.)
		Pattern p2 = Pattern.compile("[a-z][a-z0-9]{5,11}");
		Matcher m2 = p2.matcher(id);
		if(m2.matches()) {
			System.out.println("통과");
		} else {
			System.out.println("올바르지 않은 입력값입니다.");
		}
		
		// 전화번호 정규식 (010-####-####) 해보기
		System.out.println("전화번호를 입력하세요");
		String tel = scan.nextLine();
		Pattern p3 = Pattern.compile("010-[0-9]{4}-[0-9]{4}");
		Matcher m3 = p3.matcher(tel);
		if(m3.matches()) {
			System.out.println("통과");
		} else {
			System.out.println("올바르지 않은 입력값입니다.");
		}
	}
}
