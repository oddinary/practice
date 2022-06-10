import java.util.Scanner;

class Can {
	private String name;
	
	public Can(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class Main2 {
	public final int COLA = 1;
	public final int SPRITE = 2;
	public final int FANTA = 3;

	// 자판기 메소드
	// 정수형 => 반환 Type : Can
	// 1 -> field "콜라"
	// 2 -> field "사이다"
	
	// 문자열 -> 반환 Type : Can
	// "Cola" -> field "콜라"
	
	static void machine(int a) {
		Can COLA = new Can("콜라");
		Can SPRITE = new Can("사이다");
		Can FANTA = new Can("환타");
		
		switch (a) {
		case 1 : {
			System.out.println(COLA);
			break;
		}
		case 2 : {
			System.out.println(SPRITE);
			break;
		}
		case 3 : {
			System.out.println(FANTA);
			break;
		}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("자판기 입력");
		int num = scan.nextInt();
		machine(num);
	}
}
