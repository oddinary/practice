import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//배열의 단점을 극복한 사용하기 편한, 비슷한 구조의 클래스.
		ArrayList list = new ArrayList(); 	// 배열처럼 여러 자료를 가질 수 있는 객체(길이값이 정해져 있지 않다.)
		list.add("문자열 객체");				// add로 객체를 추가 할 수 있다.
		list.add(new Object());				// 기초형 타입의 값은 넣을 수 없다.
		list.add(Integer.valueOf(400));
		list.add(Double.valueOf(55.55)); 
		
		list.add(500);						// 되는데요??
		list.add(123.123);					// 사실 아님, 오토 박싱(auto-boxing)이 일어나고 그 객체의 참조가 담기는 거임
		
		int size = list.size();				// length가 아니라 size로 크기를 본다.
		System.out.println(size);			// 삽입된 순서에 따라 동적으로 size를 늘리고 객체를 삽입하고 0부터 인덱스를 부여함.
		
		for (int i = 0; i < list.size();i++) { // 반복문도 사용 가능함.
			System.out.println(list.get(i));
		}
		
		for (Object o : list ) { 			// 객체가 담기기 때문에 for-each문도 사용 가능하다.
			System.out.println(o);
		}
		
	}
}
