import java.util.StringJoiner;

public class Main2 {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");// 구분할거 입력하면 이걸로 구분해줌(사이사이에 넣어줌)
		sj.add("1");
		sj.add("2");
		sj.add("3");
		String result = sj.toString();
		System.out.println(result); // 결과 1,2,3
		StringJoiner sjo = new StringJoiner("|", "<", ">");// 시작과 끝을 정해 줄 수도 있음.
		sjo.add("1");
		sjo.add("2");
		sjo.add("3");
		String result1 = sjo.toString();
		System.out.println(result1); // 결과<1|2|3>

	}

}
