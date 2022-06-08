import java.util.Scanner;

// 사용자가 0 이하의 정수를 입력할 때 까지 반복하여 입력하고 
// 최근 5개를 출력
public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] integer = new int[5];
		int i = 0;
		while (true) {
			System.out.print("정수를 입력하세요: ");
			int n = scan.nextInt();
			if (n < 0) {
				break;
			}
			integer[i] = n;
			
			i++;
			
			if(i ==5) {
				i = 0;
			}
		}
			
		System.out.println("음수입력됨, 최근 5개의 수를 출력합니다.");
		
		for (int j = integer.length - 1; j >= 0 ; j--)	{
			System.out.print(integer[j] + " ");
		}
	
	}
}
