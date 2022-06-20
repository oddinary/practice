import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	public static boolean isInteger(String input) {
		try {
			Integer.valueOf(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		// 위의 리스트에서
		// 문자열 길이가 5글자인 문자열 만을 원소로 가지는 리스트 생성
		List<String> letters5 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == 5) {
				letters5.add(list.get(i));
			}
		}
		System.out.println(letters5);
		//리스트를 복사해서 지우는 방식
		List<String> copy = new ArrayList(list);
		Iterator<String> iterator = copy.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() != 5 ) {
				iterator.remove();
			}
		}
		System.out.println(copy);
		
		// 문자열 중에 "e"를 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> listWithE = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.contains("e")) {
				listWithE.add(list.get(i));
			}
		}
		System.out.println(listWithE);

		
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나","1000"));
		// 정수 형태 값을 가지는 문자열을 찾아 해당 원소를 가지는 정수형 리스트 생성
		List<Integer> listIsInteger = new ArrayList<>();

		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i);
			try {
				Integer value = Integer.valueOf(str);
				listIsInteger.add(value);
			} catch (NumberFormatException e) {
				
			}
		}
		System.out.println(listIsInteger);
		// '정수 형태 값'을 가지는 문자열을 ->Integer 형으로
		List<Integer> listInteger = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (isInteger(list2.get(i))) {
				listInteger.add(Integer.valueOf(list2.get(i)));
			}
		}
		System.out.println(listInteger);
	}
}
