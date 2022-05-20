public class StringEquals {
public static void main(String[] args) {
		String a = "Hello"; 
		String b = "Hello"; // b도 같은 참조가 만들어짐.
		String llo = "llo"; 
				
		System.out.println(a == b); // 값을 확인하지 않고 참조가 같은지 확인함.
		System.out.println(a == ("He" + llo));
		System.out.println("--------- 문자열 값 동등 확인----------");
		System.out.println(a.equals("He" + llo)); //문자열 비교 할 때는 equals메소드를 사용하자. 문자열 값이 동등한지를 물어보는 메소드;
	}
}