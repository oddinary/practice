import java.util.Scanner;

public class memberManagement {
	public void memberInfo(Member[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].getName().equals("null"))
				System.out.println(arr[i].toString());
			else if (arr[i].getName().equals("null"))
				continue;
		}
	}
	public void memberInput(Member[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력을 원하는 회원 번호(10번까지)를 입력하세요");
		int input = scan.nextInt();
		scan.nextLine();
		System.out.println("이름을 입력하세요");
		arr[input - 1].setName(scan.nextLine());
		System.out.println("키(M)를 입력하세요");
		arr[input - 1].setHeight(scan.nextDouble());
		System.out.println("몸무게(kg)을 입력하세요");
		arr[input - 1].setWeight(scan.nextDouble());
		System.out.println(arr[input - 1].toString());
		
		for(int i = 0; i < input - 1;i++) {
			if (arr[input - 1].equals(arr[i])) {
				System.out.println("중복된 데이터는 입력할 수 없습니다.");
				arr[input - 1] = null;
			}
		}	
		for(int i = input; i < arr.length;i++) {
			if (arr[input - 1].equals(arr[i])) {
				System.out.println("중복된 데이터는 입력할 수 없습니다.");
				arr[input - 1] = null;
			}
		}	
	}
}
