public class IntegerToString {
public static void main(String[] args) {
		//String strNum = 12345; 문자형으로 바꾸는 법.
		String strNum = String.valueOf(12345); // 문자열로 바꾸고 싶은 값을 입력한다.
		System.out.println(strNum);
		String strNum2 = "" + 12345;
		System.out.println(strNum2);
		String strNum3 = "12345"; // 애초에 문자열을 이렇게 표기함.
		System.out.println(strNum2);
		
		int i = 5055;
		String strNum4 = "" + i; // 메소드 없이 문자열로 변경하는 꼼수
		
		System.out.println(i + 100); // 결과값이 숫자열
		System.out.println(strNum4 + 100); //결과 값이 문자 + 정수
		
	}
}