public class Loop2D{
	public static void main(String[] args) {
		
		for (int j = 0; j < 5 ; j++){ // 아우터 루프
			for (int i = 0; i < 5; i++) { // 이너 루프
				System.out.print('*');
			}
			System.out.println();
		}	
	}
}