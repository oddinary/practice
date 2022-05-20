public class NotOperator {
	public static void main(String[] args){
		boolean t = true;
		System.out.println(t);
		
		t = !t;
		System.out.println(t);
		
		System.out.println(!((10 > 3) && (3 == 3)));
		System.out.println(!(!(10 > 3) || (3 == 3)));
	}
}