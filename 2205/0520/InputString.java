import java.util.Scanner;

public class InputString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("한줄을 입력하세요 : ");
		int i = scan.nextInt();
		System.out.print("한줄을 입력하세요 : ");
		scan.nextLine(); //엔터로 출력하는 메소드이기 때문에 오류발생을 막기위해 한번 더 호출해서 제거해준다.
		String line = scan.nextLine(); 
		
		System.out.println(line);
	}
}