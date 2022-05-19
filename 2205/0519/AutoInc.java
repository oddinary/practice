public class AutoInc{
	public static void main(String[] args) {
		int a = 10;
		System.out.println(++a);//증감연산자는 변수의 앞 뒤로 붙을 수 있는데, 위치에 따라 수행되는 순서와 결과가 다르므로 조심해야한다.
		// System.out.println(++a);// ++a를 먼저 수행하고 print를 수행
		// System.out.println(a++);// println을 먼저 수행하고 a++를 수행한다. 따라서 다른 명령과 같이 쓰지 말고 따로 쓰는 것이 좋다.

		//복합대입연산자 +=, -=, *=, /=, %=, ...
		// a += 1;
		// a -= 1;
		
		//증감연산자
		// a++; // a의 기존 값에서 1만큼 더해진다.
		// a++;
		
		// a--; // a의 값에서 1만큼 빼라.
		System.out.println(a);
	}
}