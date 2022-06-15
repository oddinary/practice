import java.util.Arrays;
import java.util.Comparator;
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
		arr[5].setName(scan.nextLine());
		System.out.println("키(M)를 입력하세요");
		arr[5].setHeight(scan.nextDouble());
		System.out.println("몸무게(kg)을 입력하세요");
		arr[5].setWeight(scan.nextDouble());
		System.out.println(arr[10].toString() + " 입력완료.");
		
		for(int i = 0; i < arr.length - 1;i++) {
			if (arr[10].equals(arr[i])) {
				System.out.println("중복된 데이터는 입력할 수 없습니다.");
			} else arr[input - 1] = arr[10];
		}	
	}
	
	Comparator<Member> heightCompareAsc = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			if (o1.height < o2.height) {
				return -1;
			} else if (o1.height > o2.height) {
				return 1;
			} else
				return 0;
		}
	};
	Comparator<Member> heightCompareDesc = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			if (o1.height < o2.height) {
				return 1;
			} else if (o1.height > o2.height) {
				return -1;
			} else
				return 0;
		}
	};
	Comparator<Member> weightCompareAsc = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			if (o1.weight < o2.weight) {
				return -1;
			} else if (o1.weight > o2.weight) {
				return 1;
			} else
				return 0;
		}
	};
	Comparator<Member> weightCompareDesc = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			if (o1.weight < o2.weight) {
				return 1;
			} else if (o1.weight > o2.weight) {
				return -1;
			} else
				return 0;
		}
	};
	Comparator<Member> bmiCompare = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			if (o1.getBmi() < o2.getBmi()) {
				return 1;
			} else if (o1.getBmi() > o2.getBmi()) {
				return -1;
			} else
				return 0;
		}
	};
	
	public void memberCompare(Member[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정렬의 기준을 선택하세요");
		System.out.println("1.키(오름차순), 2.키(내림차순), 3.몸무게(오름차순), 4.몸무게(내림차순), 5.BMI지수순 0. 위로");
		int input = scan.nextInt();
		while(true) {
			switch (input) {
			case 1 : {
				Arrays.sort(arr, heightCompareAsc);
				for (int i = 1; i < arr.length; i++)
					System.out.println("이름= " + arr[i].getName() + " 키= " + arr[i].getHeight());
				break;
			}
			case 2 : {
				Arrays.sort(arr, heightCompareDesc);
				for (int i = 0; i < arr.length - 1; i++)
					System.out.println("이름= " + arr[i].getName() + " 키= " + arr[i].getHeight());
				break;
			}
			case 3 : {
				Arrays.sort(arr, weightCompareAsc);
				for (int i = 1; i < arr.length; i++)
					System.out.println("이름= " + arr[i].getName() + " 몸무게= " + arr[i].getWeight());
				break;
			}
			case 4 : {
				Arrays.sort(arr, weightCompareDesc);
				for (int i = 0; i < arr.length - 1; i++)
					System.out.println("이름= " + arr[i].getName() + " 몸무게= " + arr[i].getWeight());
				break;
			}
			case 5 : {
				Arrays.sort(arr, weightCompareDesc);
				for (int i = 0; i < arr.length - 1; i++)
					System.out.println("이름= " + arr[i].getName() + " BMI지수= " + arr[i].getBmi());
				break;
			}
			case 0 : {
				break;
			}
			default : {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}break;
		}
	}
}
