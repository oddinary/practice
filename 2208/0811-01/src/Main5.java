import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
		// 정규표현식에서 영문자의 표현은 \w지만 자바에서 \\w로 쓴다.
		// + 1 이상
		// ? 0 이거나 1
		// * 0 이상
		
		// \w 영문자
		// \d 숫자
		// \s 공백
		Pattern p = Pattern.compile("\\w{3,}");
	}
}
