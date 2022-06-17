import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple banana carrot dount egg"; // 여기서 n번째 단어를 뽑아내려면 어떻게 해야할까?
		
		System.out.println(longLine.substring(13, 19));// 이방법으로 할 수은 있겠으나 인덱스를 일일히 알아내야함.(비추)
		
		String[] arr = new String[5];
		StringBuilder sb = new StringBuilder(longLine);
		for(int i = 0; i < 3; i++) {
			int spaceIndex = sb.indexOf(" ");
			arr[i] = sb.substring(0, spaceIndex);
			sb.replace(0, spaceIndex + 1, "");
		}												
		
		System.out.println(arr[2]);						// 이 방법은 줄을 너무 많이 씀
		
		String[] split = longLine.split(" ");
		System.out.println(split[2]);					// 검색하면 이 방법이 나옴
		
		StringTokenizer st = new StringTokenizer(longLine, " "); // (문자열, 잘라내는 기준) 기준에 맞게 문자열을 잘라준다.(여러개 쓰면 여러개로 잘라줌)
		while (st.hasMoreTokens()) { // boolean값으로 true일 때 
			System.out.println(st.nextToken()); // nextToken으로 값을 가져온다.
		}
	}
}
