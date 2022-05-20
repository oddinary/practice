public class TestTypes {
	public static void main(String[] args) {
		byte b = 10;
		short s = 100; // 위의 두개는 컴파일러가 int로 취급해서 연산시에 int를 따라가려고함.
		
		int i = (int) 1000L; // 형 변환(Type casting)의 축소는 손실의 가능성이 있어 자동으로 일어나지 않음.
		int j = (int) 31247483647L; // 문제가 없다고 판단하거나 손실의 가능성을 확인했을 경우에만 강제로 축소해주자.
		long l = 10000; // int형이지만 자동적으로 long형으로 확장되었다.
		
		int sum = b + s; //자료형의 확장(promotion)은 자동으로 이뤄짐
		System.out.println(sum);	
		System.out.println(i);	
		System.out.println(j);	
		System.out.println("--------------------------------------");
		
		double d = 123.456;
		int k = (int) d; // 정수형과 실수형에서는 정수형으로 갈 경우에 축소가 일어나고 소수점 밑으로 손실이 일어남.
		System.out.println(k);
		System.out.println("--------------------------------------");
		
		char a = (char) 65;
		System.out.println(a);
		
		int num = (int) a;
		System.out.println(num);
	}
}