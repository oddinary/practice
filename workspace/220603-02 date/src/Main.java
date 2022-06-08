import java.time.LocalDate; // 1.8부터 사용가능
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
//		// 날짜를 만들어주는 객체. 오늘 날짜를 만들어 준다.
//		Calendar now = Calendar.getInstance();
//		// 정수를 넣게 되어있음 
//		System.out.println(now.get(1)); // 연 표시
//		System.out.println(now.get(2)); 
//		System.out.println(now.get(2) + 1); // 월 표시 (1월이 0이라 +1을 붙여야 정확한 월의 숫자가 나온다)
//		System.out.println(now.get(5)); // 일 표시
//		System.out.println(now.get(7)); // 요일 표시 (일요일이 1, ..., 토요일이 7)
//		System.out.println("------------------------"); 
//		System.out.println(now.get(Calendar.YEAR)); // 연 표시, 값 1에 대해 이름을 붙여 놓은 것
//		System.out.println(now.get(Calendar.MONTH) + 1); // 월 표시, 값 2에 대해 이름을 붙여 놓은 것
//		System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 일 표시, 값 5에 대해 이름을 붙여 놓은 것
//		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 요일, 값 7에 대해 이름을 붙여 놓은 것
		
		LocalDate now = LocalDate.now();//now가 스태틱
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfWeek().getValue());// 월요일이 1, ..., 일요일이 7

	}

}
