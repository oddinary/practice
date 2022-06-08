public class Main3 {
	public static void main(String[] args) {
		//실수 1.02, 0.03, 4.0
		
		double[] myArr = new double[] {1.02, 0.03, 4.1}; //더욱 간편한 선언초기화 방법. 길이값을 따로 적어둘 필요가 없다.
		double[] myArr1 = {1.04, 0.23, 4.2}; //더더욱 간편한 선언초기화 방법. 길이값을 따로 적어둘 필요가 없다.
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]); // 변수를 일일히 설정해주는 것 보단 훨씬 편함
		}
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr1[i]); 
		}
	}
}
