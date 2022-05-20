//사용자의 나이와 이름을 입력받아서
//자기랑 같으면 true 출력하기
import java.util.Scanner;

public class SameSame{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이을 입력하세요: ");
		int age = scan.nextInt();
		
		System.out.print("이름을 입력하세요: ");
		scan.nextLine();
		String name = scan.nextLine();
		// String name = scan.next(); 한 단어를 (스페이스를 구분자로 사용함) 가져올 때 사용함.
		
		System.out.print((name.equals("이진호")) && (age == 31));
	}
}