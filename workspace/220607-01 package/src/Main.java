//package는 폴더, 디렉토리
import first.InPackageClass;
import first.second.AnotherClass; // 이렇게 불러와 줘야 에러가 안뜬다.

public class Main {

	public static void main(String[] args) {
		InPackageClass test = new InPackageClass();
		
		AnotherClass test2 = new AnotherClass();
		// 클래스를 찾을 때 같은 패키지에서 먼저 찾고 없으면 없는 취급한다.(컴파일 에러)
		test2.number = 10;
//		test2.mySecret = 22;
		test2.test = 33;
	}

}
