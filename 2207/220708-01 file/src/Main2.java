import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		// 상대 경로
		File file = new File(".\\"); // .은 현재 경로를 의미함(현재파일 기준으로)
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath()); // 상대경로를 절대 경로로 만들어 준다(.을 우리가 해석해야함)
		try {
			System.out.println(file.getCanonicalPath()); // 상대경로를 절대 경로로 만들어 준다(.을 해석한 경로를 알려줌)
		} catch (IOException e) { // 파일입출력시 볼 수 있는 체크드 익셉션
			e.printStackTrace();
		}
		
		File fileParent = new File("..\\");// ..은 상위 경로를 의미함(현재파일 기준으로)
		
		System.out.println(fileParent.getAbsolutePath()); // 상대경로를 절대 경로로 만들어 준다(.을 우리가 해석해야함)
		try {
			System.out.println(fileParent.getCanonicalPath()); // 상대경로를 절대 경로로 만들어 준다(.을 해석한 경로를 알려줌)
		} catch (IOException e) { // 파일 입출력시(아주 자주) 볼 수 있는 체크드 익셉션 매번 처리 해주는 게 좋음
			e.printStackTrace();
		}
		System.out.println("----------------");
		
		try {
			File file3 = file.getCanonicalFile().getParentFile();
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3)); // 표현 방식이 달라 false가 나옴
			System.out.println(fileParent.compareTo(file3));
			System.out.println(fileParent.getCanonicalFile().equals(file3));
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
