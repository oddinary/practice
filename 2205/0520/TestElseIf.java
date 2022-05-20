//용량을 입력받아서 200이상이면 라지 100미만이면 스몰 나머지는 미디엄
import java.util.Scanner;

public class TestElseIf{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("컵의 용량은? : ");
		int cup = scan.nextInt();
		
		String size;
		if (cup > 200) {
			size = "large";
		} else if (cup >= 100){ // && cup <= 200){
			size = "medium";
		} else {//if (cup < 100){
			size = "small";
		}
		
		System.out.println("컵의 용량은 : " + size);
	}
}