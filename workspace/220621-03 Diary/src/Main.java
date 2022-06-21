import java.util.LinkedList;
import java.util.Queue;

// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기 등록
// 같은 날짜에는 일기가 중복되면 안된다.

// 일기 목록도 볼 수 있음.
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정가능
// 삭제도 가능한데 삭제를 수행하면 가장 오래된 일기가 삭제됨(다 하면 선택해서 삭제하는 것도 해보자)

public class Main {
	public static void main(String[] args) {
		Diary diary = new Diary();		
		diary.DiaryManage();
	}
}
