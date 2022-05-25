//주민번호를 입력하면 성별을 출력하는 프로그램 예)xxxxxx-1xxxxxx
import java.util.*;

public class Gender {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 13자리를 입력하세요 (- 포함): ");
		String n = scan.nextLine();
		
		if (n.length() == 14) {
			char num = n.charAt(7);
			System.out.println(num);
			switch (num) {
				case '1':
				case '3': 
					System.out.println("남성입니다.");
					break;
				case '2':
				case '4': 
					System.out.println("여성입니다.");
					break;
				default : 
					System.out.println("구분할 수 없습니다.");
					break;
			}
		} else {
			System.out.println("잘 못 입력되었습니다.");
		}
	}
}