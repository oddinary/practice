import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3,23,35,11,23,57,79));
		// 합, 평균
		// 정수 57이 리스트에 있는지? 있으면 몇번째 index에 위치 하는지?
		// 정수 23의 갯수와 중복되는 원소 23을 하나 삭제하기
		int sum = 0;
		for (int i = 0; i < list.size() ; i++ ) {
			sum += list.get(i);
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + sum / list.size());
		
		System.out.println(list.contains(57));
		System.out.println(list.indexOf(57));
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(23))
				count++;
		}
		System.out.println("23의 갯수: " + count);
		
//		int index = list.lastIndexOf(23);
//		list.remove(index);
		
		list.remove(Integer.valueOf(23));
		System.out.println(list);
		
		
		
	}
}
