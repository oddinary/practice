// 사용자에게 5번의 정수를 입력받아 
// 최근에 입력한 수  역순으로 출력하기

import java.util.Scanner;
public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] integer = new int[5];
		for (int i = 0; i < integer.length; i++) {
			System.out.print("정수을 입력하시오 : ");
			integer[i] = scan.nextInt();
		}
		for (int i = (integer.length - 1); i >= 0; i--)	{
			System.out.print(integer[i] + " ");
		}
	}
}
