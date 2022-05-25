// 피보나치수열 100이하로 나열하기
// 1 1 2 3 5 8 13 21 34

import java.util.*;

public class Drill4 {
	public static void main(String[] args) {
		int	a1 = 1;
		int	a2 = 1;
		int	a3 = a1+a2;
		System.out.print(a1 + " ");
		System.out.print(a2 + " ");
		System.out.print(a3 + " ");
		
		while (true) {
			a1 = a2;
			a2 = a3;
			a3 = a1 + a2;
			
			if (a3 > 100) {
				break;				
			}	
			System.out.print(a3 + " ");
		} 
		System.out.println("프로그램 종료");
	}
}