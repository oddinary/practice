// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz....
// 3의 배수는 Fizz 5의 배수는 Buzz 3과 5의 배수는 같이 출력하기 35까지

import java.util.*;

public class Drill3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 35; i++) {
			String num = String.valueOf(i);
			
			if (i % 3 == 0) {
				num = "Fizz";
			}
			if (i % 5 == 0) {
				num = "Buzz";
			}
			if (i % 15 == 0) {
				num = "Fizz Buzz";
			}
			System.out.print(num + " ");
		}
	}
}