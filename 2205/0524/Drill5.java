// 사용자가 입력한 정수가 소수임을 확인하여 출력하는 프로그램(약수가 1과 자기 자신 뿐인 수)

import java.util.*;

public class Drill5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int n = scan.nextInt();
		
		int count = 0;
		if (n == 1){
			System.out.print("1은 소수가 아닙니다.");
		}
		else {
			for (int i = n; i > 0; i--) {
				if (n % i == 0) {
					System.out.print(n / i + " ");
					count++;
				}
			}
			if (count == 2) {
				System.out.print(n + "소수입니다.");
			} else {
				System.out.print("소수가 아닙니다.");
			}
		}	
	}
}