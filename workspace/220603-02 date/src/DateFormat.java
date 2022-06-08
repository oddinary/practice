import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
//		//날짜를 문자열 형태로 변경해보자
//		Calendar cal = Calendar.getInstance(); // 시간 정보도 알수 있따.
//		Date date = cal.getTime(); // 둘다 
//		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String result = dateFormat.format(date);
//		System.out.println(result);
		
	}

}
