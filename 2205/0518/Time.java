//사용자에게 초 단위의 시간을 입력받아 시간 분 초로 변환을 하는 프로그램
//입력예 3666
//출력예 1시간 1분 6초
import java.util.Scanner;

public class Time {
	public static void main(String[] args){//중괄호랑 세미콜론 주의!
	
	Scanner scan = new Scanner(System.in);
	
	int x; // 입력받는 초
	int sec;
	int min;
	int hour;
	
	System.out.print("시간을 입력하세요(초): ");
	x = scan.nextInt();
	
	hour = x / 3600;
	min = (x % 3600) / 60;
	sec = (x % 3600) % 60;
	System.out.print(hour + "시간 " + min + "분 " + sec + "초");
	}
}