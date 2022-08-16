import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
	public static void main(String[] args) {
		String line = "123 He234llo. 39 Wor48ld! 57";
		// 대괄호 다음 중괄호를 넣으면 길이값을 설정해 줄 수 있다.(길이값만큼 연속되는 걸 찾아준다) ,를 쓰면 길이값의 범위를 지정
		Pattern p = Pattern.compile("[0-9]{2,3}");
		Matcher m = p.matcher(line);
		
		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
	}
}
