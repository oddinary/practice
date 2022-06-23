import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7)); // 이 둘을 모두 포함 하는 set을 만들어 보자
		
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		
		System.out.println(setUnion); // 합집합
		
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB); // 중복되는 원소만 남기고 다 지워주는 메소드 (교집합)
		System.out.println(setDuplicate);
		
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB); // 중복되는 값은 다 지워 준다 (차집합)
		System.out.println(setLeftOuter);
		
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7,6,5,4,3,2,1));
		System.out.println(setSame.equals(setUnion)); // 같은지 보려면 equals 대신 순서는 상관없다.
	}
}
