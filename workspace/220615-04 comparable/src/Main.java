import java.util.Arrays;

class Member implements Comparable<Member> {// <제네릭> 비교하고자 하는 대상 타입
	String name; // 이름
	int height; // 키
	int weight; // 몸무게

	public Member(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 키를 기준으로 대소 비교를 해보자.

//	public int compare(Member member){//비교(대상 다른 멤버) 
//		return height - member.height; // 크면 양수, 같으면 0, 작으면 음수
//	}

	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
}

public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰 놈", 190, 80), new Member("키 작은놈", 145, 45), new Member("중간 놈", 175, 65) };
		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);

	}
}
