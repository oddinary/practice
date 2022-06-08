import java.util.Arrays;

public class Main4 {
	static void printArray(char[] array) { //파라미터에 타입과 파라미터이름 설정
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String arrayToString(char[] target) {
		String str = "";
		for (int i = 0; i < target.length; i++) {
			str += target[i];
		}
		return str;
	}
	
	// 캐릭터 배열에서 하나의 특정문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target, char c) { 
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
				return i;
			}
		}
		 return -1;
	}
	
	
	public static void main(String[] args) {
		char[] hello = {'H','e','l','l','o'};
		String result =	Arrays.toString(hello); // 문자열로 반환하는 스태틱한 메소드
		System.out.println(result);
		
		
//		Main4.printArray(hello); // Main4 생략가능
//		String result = arrayToString(hello);
//		System.out.println(result);
		
		//출력해보세요
//		for (int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
		
		// 위의 문자 배열에 o의 문자에 해당하는 인덱스를 찾아보세요~
//		for (int i = 0; i < hello.length;i++) {
//			if (hello[i] == 'o') {
//				System.out.println("찾았다: " + i);
//			}
//		}
		
		
	}
}
