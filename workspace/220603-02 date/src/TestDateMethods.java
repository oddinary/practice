import java.time.LocalDate;
import java.util.Calendar;

public class TestDateMethods {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now(); // 현재시간
		// 내일 날짜 구하기
		LocalDate tomorrow = now.plusDays(1);
		LocalDate yesterday = now.minusDays(1);
		System.out.println(tomorrow);
		System.out.println(yesterday);
		//코드는 저작권이 있어서 라이센스를 보고 써야한다.
		
		Calendar now1 = Calendar.getInstance();
//		now1.set(2022, Calendar.JUNE, 4);
		now1.add(Calendar.DAY_OF_MONTH, 1);
		
		
	}

}
