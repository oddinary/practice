import java.util.Arrays;
import java.util.Scanner;

// 회원관리 프로그램
// 회원을 콘솔 입력으로 등록할수잇게 . 최대 10명
// 중복 등록이 되면 안됨. (이름, 키, 몸무게가 동일하면 중복입니다.)
// 회원 (이름 , 키 , 몸무게)
// BMI지수 ( 몸무게(kg) / 키 ^ 2 (m) )

// 고도 비만 : 35 이상
// 중(重)도 비만 : 30이상 - 35미만
// 경도 비만 : 25이상-30미만
// 과체중: 23이상 25미만
// 정상 : 18.5이상 - 23미만
// 저체중 : 18.5 미만


public class Main {
	public static void management() {
		Member[] member = new Member[10];
		for (int i = 0; i < member.length; i++) {
			member[i] = new Member();
		}
		memberManagement m = new memberManagement();
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("회원관리 프로그램");
			System.out.println("1. 회원 정보 확인");
			System.out.println("2. 회원 정보 입력");
			System.out.println("0. 프로그램 종료");
			int input = scan.nextInt();
				switch (input) {
				
				case 1:{
					m.memberInfo(member);
					continue;
				} 
				case 2:{
					m.memberInput(member);
					continue;
				} 
				case 0:{
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				default : {
					System.out.println("잘못된 입력입니다.");
					continue;
				}	
				}break;
		}System.out.println("프로그램 종료");
	}
	public static void main(String[] args) {
		management();
	}
}
