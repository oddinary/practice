import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
	public static void main(String[] args) {
		String line = "(abc, 123) | (de, 6) | (qwer, 15)";
		
		// '(문자, 숫자)' 형식의 글자를 찾아봅시다
		// 문자 괄호는 \\(, \\)로 나타낸다
		// 그룹을 지어주려면 문자 안에 ()를 해주면 된다.
		Pattern p = Pattern.compile("\\((\\w+), (\\d+)\\)");
		Matcher m = p.matcher(line);
		
		while (m.find()) {
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
	}
}
