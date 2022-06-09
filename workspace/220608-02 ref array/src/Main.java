public class Main {
	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = "DEF";
		String str3 = "GHI";
		
		String[] arr = new String[3]; // 참조형 배열 선언 
		//현재는 null참조
		arr[0] ="ABC"; 	// 초기화
		arr[1] ="DEF"; 	// 값을 참조 하고 있는 중
		arr[2] ="GHI";	// 배열 안에는 참조만 들어가 있다.
		System.out.println(arr[0]); // 확인
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
