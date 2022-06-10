import java.util.Arrays;
import java.util.Scanner;

/*도서 관리 프로그램
 * 목록보기 
 * 1. 가격 순으로. 오름차순, 내림차순 선택가능 가격순으로 가격이 같을땐?
 * 2.분야를 선택해서 해당 분야만 보기
 * 
 * ----------다되면
 * 3. 상세보기
 * 4. 도서 정보 수정.
 * 5. 도서 정보 추가.
 */

public class Main {

	
	public static void main(String[] args) {
		BookStore b = new BookStore();
		b.bookStore();
	}
}
