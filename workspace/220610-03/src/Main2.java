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
	public final static int COLA = 1;
	public final static int SPRITE = 2;
	public final static int FANTA = 3;

	// 자판기 메소드
	// 정수형 => 반환 Type : Can
	// 1 -> field "콜라"
	// 2 -> field "사이다"

	// 문자열 -> 반환 Type : Can
	// "Cola" -> field "콜라"

	public static boolean isNumber(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	static Can machine(int a) {
		Can Cola = new Can("콜라");
		Can Sprite = new Can("사이다");
		Can Fanta = new Can("환타");
		Can nothing = new Can("잘못된 입력입니다.");

		switch (a) {
		case COLA: {
			return Cola;
		}
		case SPRITE: {
			return Sprite;
		}
		case FANTA: {
			return Fanta;
		}
		default: {
			return nothing;
		}
		}
	}

	static Can machine(String a) {
		Can Cola = new Can("콜라");
		Can Sprite = new Can("사이다");
		Can Fanta = new Can("환타");
		Can nothing = new Can("잘못된 입력입니다.");

		switch (a) {
		case "콜라":
		case "cola":
		case "Cola": {
			return Cola;
		}
		case "사이다":
		case "sprite":
		case "Sprite": {
			return Sprite;
		}
		case "환타":
		case "fanta":
		case "Fanta": {
			return Fanta;
		}
		default: {
			return nothing;
		}
		}
	}
	static void vending() {
		Scanner scan = new Scanner(System.in);
		System.out.println("자판기 입력");
		System.out.println("1.콜라(Cola), 2.사이다(Sprite), 3.환타(Fanta)");
		String input = scan.nextLine();

		if (isNumber(input)) {
			int number = Integer.parseInt(input);
			System.out.println(machine(number));
		} else {
			System.out.println(machine(input));
		}
	}
	public static void main(String[] args) {
		vending();
	}
}
