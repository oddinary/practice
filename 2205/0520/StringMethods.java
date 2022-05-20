public class StringMethods{
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o"); // ("")의 문자열이 왼쪽에서 몇 번째 인덱스를 가지는 가를 물어보는 메소드
		System.out.println(index);
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound); // 없는 문자열은 -1로 표시
		
		int index2 = hello.indexOf("ll"); // 연속된 문자열을 찾을 때에는 제일 앞에 인덱스를 출력하고, 떨어진 문자열을 찾을 수 없어서 -1을 출력한다.
		System.out.println(index2);
		
		int index3 = hello.lastIndexOf("l"); // 오른쪽에서 부터 인덱스를 찾는 메소드
		System.out.println(index3);
		
		int index4 = hello.indexOf("l", 3); // 어디서부터 시작할 지를 설정할 수 있음.
		System.out.println(index4);
		
	}
}