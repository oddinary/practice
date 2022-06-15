package src;

// 학생 이름 나이 점수 		이름 알려주기 점수 알려주기
// 작가 이름 나이 작품 목록	이름 알려주시 작품목록 알려주기
// 		이름, 나이 처럼 공통된 부분이 있음.
//		이런 상황을 객체지향에서 좀더 쉽게 접근하고자
//		상하 계층구조를 만들어 놓고 모두 접근하게 할 수 있는 방법이 있음.(중복되는 코드를 줄일수 있겠죠?)
// 		이 것을 '상속(inheritance)'이라고 부른다. 상하 관계간에 클래스의 특징을 그대로 물려 받는 것
public class Main1 {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		Student s = new Student("학생이름", 17, 90);
		System.out.println(s.getName());
		System.out.println(s.getScore());
		Author a = new Author("작가이름", 25, "몰루");
		System.out.println(a.getName());
		System.out.println(a.getBookList());
	}
}
