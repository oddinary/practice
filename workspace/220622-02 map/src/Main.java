import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("일", 1); // add 대신 put을 쓴다.
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		System.out.println(map.get("일")); 	// key 값을 전달 받아서 value를 보여준다.
											// 없는 key값을 전달하면 null을 반환한다.
		
		map.put("이", 2222);					// 새 값을 적으면
		
		System.out.println(map.get("이"));	// 중복없이 덮어 씌워진다. 결과 = 2222
											// 중복을 하기 싫으면
		if (!map.containsKey("삼")) { 		// 있는지 확인하고
			map.put("삼", 3333);				// 없으면 넣는다.
		}
		System.out.println(map.get("삼"));
	}
}
