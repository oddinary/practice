import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("a","b","c","d")); 	// 지울 때도 크게 다르지 않은 데 어떤걸 써야 할까??
		list.remove(0);															// 추가 삭제가 자주 일어날 때 쓰는 것이 인덱스를 땡기고 밀고 할 필요 없이 맺고 끊는 것이 깔끔하다.
		list.remove("c");
	}
}
