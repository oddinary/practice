
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본"); // 문자열 객체를 만들어주는 역할
		sb.append(", One=");							// 멀티스레드에 불안정적임. 대신 상대적으로 빠름
		sb.append(1);
		sb.append(", Color="); // 메모리 공간을 효율적으로 접근해 볼 수 있다.
		sb.append(255.0); // append().append().이런식으로 사용할 수 있다.(자기자신의 참조를 반환하는 메소드)
		// sb.append(", One=").append(1).append(", Color=").append(255.0); 가 위의 결과와 같음
		// 값에 대한 변경, 지우기 잘라내기 사이에 추가하기도 가능하다. reverse로 뒤집어 주기도 가능하다.
				
		sb.setCharAt(0, 'Q'); // (index, ch)
		sb.replace(3, 4, "오잉"); //(시작, 끝, 문자열) 대체
		sb.insert(0, "시작"); // 연산
		
		String result = sb.toString();
		System.out.println(result);
		
		StringBuffer sbf; // 멀티스레드에 안정적임. 대신 상대적으로 느림	
		
		String str = "원본 문자열";
		String origin = "원본 문자열";
		String other = "다른 문자열";
		String concat = str + other;
		
		System.out.println(concat);
		System.out.println("원본 문자열다른 문자열" == concat); 	// 결과값 : false
															// 이 경우 같은 값을 가지는 인스턴스가 두개가 있음
		
		System.out.println(str == origin); 	// 결과값 : true
											// 인스턴스는 공간을 차지하기 때문에 같은 값을 가지면 같은 참조를 하도록 만들어져는 있음
											// 하지만 위에와 같이 합연산을 하면 어쩔 수 없이 다른 참조를 만들어야함
											// 이게 쌓이면 공간의 낭비가 심해진다.
	}

}
