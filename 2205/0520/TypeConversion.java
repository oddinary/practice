public class TypeConversion{
	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4; // f는 1.0 5/4가 먼저 연산이 되고 f에 대입됨
		System.out.println(f);
		f = (double) 5 / 4; // f는 1.25 double로 확장이 먼저 일어나고 연산후에 대입됨
		System.out.println(f);
		f = 5 / (double) 4; // f는 1.25 double로 확장이 먼저 일어나고 연산후에 대입됨
		System.out.println(f);
		f = (double) 5 / (double) 4; // f는 1.25 double로 확장이 먼저 일어나고 연산후에 대입됨
		System.out.println(f);
		i = (int) 1.3 + (int) 1.8; // i는 2 int로 축소가 먼저 일어나고 연산이 이루어짐
		System.out.println(i);
		i = (int) (1.3 + 1.8); // i는 3 연산이 먼저 이뤄지고 int로 축소됨
		System.out.println(i);
	}
}