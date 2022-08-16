import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		
		// 정규표현식		
		String line = "This is a book.";
		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher(line);
		
		System.out.println(m.lookingAt());// 시작부분이 같은가? 시작부분이 같으면 true
		
		boolean find = m.find(); // 찾아라! 찾았으면 true

		if (find) {
			System.out.println(m.start());//시작점(시작하는 인덱스)
			System.out.println(m.end()); // 끝점(그 다음 인덱스)
		}
		
		find = m.find();
		if (find) {
			System.out.println(m.start());//시작점(시작하는 인덱스)
			System.out.println(m.end()); // 끝점(그 다음 인덱스)
		}
		find = m.find();
		if (!find) {
			System.out.println("읎음");
		}
		//정규표현식에서는 위와 같이 똑같은 문자를 찾아내 준다.
	}
}
