public class Makreve {
	public static void main(String[] args){
		
		for (int j = 1; j<= 5; j++){
			System.out.println();
			if (j % 2 == 0) {
				for (int i = 5; i > 0; i--){
				System.out.printf("(%d) ", i);
				}
			} else {
				for (int i = 1; i <= 5; i++) {
				System.out.printf("(%d) ", i);
				}
			}
		}	
	}
}