public class Print2D {
	public static void main(String[] args) {
		for (int j = 1; j < 5; j++){
			for (int i = 1; i < 5; i++) {
				System.out.printf("(%d, %d)", j, i);
			} 
			System.out.println();
		} 
	}
}