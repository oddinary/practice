import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); // 연결 방식만 다르다. list의 구현체. list와 큰 차이가 없다.
		
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		
		for(int i = 0; i < list.size(); i++){
			list.get(i);
		}
		for(String s : list) {
			System.out.println(s);
		}
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
	}
}
