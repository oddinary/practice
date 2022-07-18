import kr.co.greenart.MyMath;
import kr.co.greenart.Person;

public class Main {
	public static void main(String[] args) {
		// Person과 MyMath 클래스를 포함한 jar파일을 배포했고 그걸 라이브러리로 불러왔으므로 그걸 쓸수있음.
		// 의존성이 생김
		Person p = new Person("이름", 15);
		System.out.println(p);
		System.out.println(MyMath.getZero());
		System.out.println(MyMath.sum(10, 20));
	}
}
