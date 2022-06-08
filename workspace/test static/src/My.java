
public class My {
	static int myNumber = 200;
	
	public static void changeNumber() {
		Your.yourNumber = 10000;
	}
	
	public static void main(String[] args) {
		System.out.println(My.myNumber);
		System.out.println(Your.yourNumber);
		
		
		My.changeNumber();
		System.out.println(Your.yourNumber);
		
		Your.changeNumber();
		System.out.println(Your.yourNumber);
	}
}
