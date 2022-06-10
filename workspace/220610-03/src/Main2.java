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
	
	
	static Can machine(int a) {
		Can Cola = new Can("콜라");
		Can Sprite = new Can("사이다");
		Can Fanta = new Can("환타");
		Can nothing = new Can("아무것도 없음");
		
		switch (a) {
		case COLA : {
			return Cola;
		}
		case SPRITE : {
			return Sprite;
		}
		case FANTA : {
			return Fanta;
		}
		default : {
			return nothing;
		}
		}
	}
	
	static Can machine(String a) {
		Can Cola = new Can("콜라");
		Can Sprite = new Can("사이다");
		Can Fanta = new Can("환타");
		Can nothing = new Can("아무것도 없음");
		
		switch (a) {
		case "콜라" :
		case "Cola" :
		{
			return Cola;
		}
		case "사이다" :
		case "Sprite" :{
			return Sprite;
		}
		case "환타" :
		case "Fanta" :{
			return Fanta;
		}
		default : {
			return nothing;
		}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("자판기 입력");
		String number = scan.nextLine();
//		int num = 0;
//		if(number.equals("1") || number.equals("2") || number.equals("3"))
//			{num = Integer.parseInt(number);}
//		else if (number.equals("Cola") || number.equals("콜라")) {
//			num = 1;
//		}
//		else if (number.equals("Sprite") || number.equals("사이다")) {
//			num = 2;
//		}
//		else if (number.equals("Fanta") || number.equals("환타")) {
//			num = 3;
//		}
//		else {
//			System.out.println("잘못된 입력입니다.");
//		}
		System.out.println(machine(number));
	}
}
