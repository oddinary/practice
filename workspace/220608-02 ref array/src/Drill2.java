import java.util.Scanner;

// p237 2번 숫자 범위 별찍ㄱ
public class Drill2 {
	static String inNumber(int a, int b, int[] arr) {
		int x = 0;
		String k = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= a && arr[i] <= b) {
				x++;
			}
		}

		for (int i = 0; i < x; i++) {
			k += "*";
		}

		return k;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			System.out.print("0과 100 사이의 정수 10개를 입력하시오 : ");
			num[i] = scan.nextInt();
		}
		for (int i = 0; i <= 9; i++) {
			System.out
					.println(((i * 10) + 1) + "~" + ((i + 1) * 10) + " : " + inNumber((i * 10) + 1, (i + 1) * 10, num));
		}

//		System.out.println("01 ~ 10 : " + inNumber(1, 10, num));
//		System.out.println("11 ~ 20 : " + inNumber(11, 20, num));
//		System.out.println("21 ~ 30 : " + inNumber(21, 30, num));
//		System.out.println("31 ~ 40 : " + inNumber(31, 40, num));
//		System.out.println("41 ~ 50 : " + inNumber(41, 50, num));
//		System.out.println("51 ~ 60 : " + inNumber(51, 60, num));
//		System.out.println("61 ~ 70 : " + inNumber(61, 70, num));
//		System.out.println("71 ~ 80 : " + inNumber(71, 80, num));
//		System.out.println("81 ~ 90 : " + inNumber(81, 90, num));
//		System.out.println("91 ~ 100 : " + inNumber(91, 100, num));
	}

}
