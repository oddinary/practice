import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); // 선입선출
		
		queue.add("원소1");
		queue.offer("원소2"); // add의 추상 메소드(큐에서만 쓴다)
		
		System.out.println(queue);
		
		String elem1 = queue.poll(); // 가장 앞의 원소를 꺼내서 참조를 반환한다.비어있으면 널을 반환
		String elem2 = queue.remove(); // 가장 앞의 원소를 꺼내서 참조를 반환한다.원소가 없으면 예외가 발생
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
			
	}
}
