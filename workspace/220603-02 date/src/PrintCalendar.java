import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PrintCalendar {

	public static void PrintCalender(int year, int month) {

		int date = 1; // 일
		int day; // 요일

		LocalDate numOfDay = LocalDate.of(year, month, date);
		day = numOfDay.getDayOfWeek().getValue();
		// 달력 출력
		System.out.println(month >= 10 ? String.format("%d년 %d월", year, month) : String.format("%d년 %02d월", year, month));
		
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		
		// 1일 전까지의 공백 생성
		for(int i = 0; i < day % 7; i++) {
			System.out.print("\t");
		}
		//달력 일 출력
		for(int i = 1; i <= numOfDay.lengthOfMonth(); i++) {
			System.out.printf("%02d\t", date++);
			day++;
			
			if(day % 7 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int year;
		int month;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : [yyyy 형식]");
		year = scan.nextInt();
		System.out.println("월을 입력하세요 : [MM 형식]");
		month = scan.nextInt();
		PrintCalender(year, month);
	}
}