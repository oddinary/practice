import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 1. 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화
		// 2. 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화
		
		// 3. 위의 리스트의 원소를 모두 다 가지는 리스트 생성 및 초기화
		// 4. 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 새 복사본 리스트 인스턴스 생성
		// 5. random 객체를 사용하여 0~10 사이의 난수(정수형)을 6개 가지는 리스트 (중복되지 않아야함)
		
		// 1.
		List<Integer> listOfTwo = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			listOfTwo.add(i * 2);
		}
		System.out.println("listOfTwo: " + listOfTwo);
		
		// 2.
		List<Integer> listOfSeven = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			listOfSeven.add(i * 7);
		}
		System.out.println("listOfSeven: " + listOfSeven);
		
		// 3.
		List<Integer> listOfAll = new ArrayList<>();
		listOfAll.addAll(listOfTwo);
		listOfAll.addAll(listOfSeven);
		System.out.println("listOfAll: " + listOfAll);
		
		// 4.
		List<Integer> listOfSort = new ArrayList<>(listOfAll);
		Collections.sort(listOfSort);
		System.out.println("listOfSort: " + listOfSort);

		// 5.
		List<Integer> listOfRandom = new ArrayList<>();
		Random r = new Random();
		while (listOfRandom.size() < 6 ) {
			int result = r.nextInt(11);
			if(!listOfRandom.contains(result))
				listOfRandom.add(result);
		}
		System.out.println("listOfRandom: " + listOfRandom);
	}
}
