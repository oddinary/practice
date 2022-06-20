import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 	// 제네릭 선언할 때 왼쪽에 선언이 되어 있다면 우측에는 꺽쇠만 적어놔도 된데.
		//위의 리스트에 10, 20, 30,40					// list를 상속함. list는 인터페이스
		// 모든 원소들을 출력하기							// 기능이 같은 데 굳이 list를 쓰는 이유가 뭘까?
		for(int i = 1; i <= 4; i++) {				// 리스트라는 형으로도 다룰 수 있어서
			list.add(i * 10);
		}
		System.out.println(list.toString());
		// 변경도 가능함. set
		list.set(1, 15); // (인덱스 번호, 값)
		System.out.println(list);
		
		System.out.println(list.contains(15)); // 값을 가지고 있는지 알아볼 수 있다.
		System.out.println(list.indexOf(15)); // 값의 인덱스번호를 알아볼 수 있다.
		
		list.remove(2); // 삭제도 가능 인덱스값을 알려주면 값을 지워주는데, 
		System.out.println(list); // size가 줄고 인덱스가 땡겨짐
		
		list.add(0,0); // (인덱스번호, 값) 을 넣으면 값이 인덱스번호에 맞게 삽입되고
		System.out.println(list); // size가 늘고 인덱스가 밀려남
		
		list.clear(); // 전부 지워버릴수도 있다.
		System.out.println(list); // 다 지울 때는 인덱스가 왔다 갔다 할 수 도있으니까 반복문 사용은 지양하자.
		System.out.println(list.size() == 0); // 다 지워졌는지 확인 할때는?
		System.out.println(list.isEmpty()); // 이 두 가지 방법을 쓴다.
		
	}
}
