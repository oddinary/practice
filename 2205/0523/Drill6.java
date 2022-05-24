//사용자가 입력한 영단어(latin 문자열)에서 모음(a e i o u)가 몇 개인지 출력하세요.
import java.util.Scanner;

public class Drill6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//입력
		System.out.print("단어를 입력하세요 : ");
		String word = scan.nextLine();
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
               if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    count++;
               }
            }            
            
		
		//출력
		System.out.print("입력한 단어 : " + word);
		System.out.println("모음의 갯수 : " + count);
	}
}