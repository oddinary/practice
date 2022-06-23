import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {
	public static void main(String[] args) {
		// CLI
		
		// GUI
		// AWT / 'SWING' (스윙만 순수 자바 코드로 만들수 있음, AWT의 확장개념)
		// JavaFX
		
		// 구글(저쪽동네)
		// Android
		
		
		JFrame frame = new JFrame("제목입니다."); // 기본적으로는 안보이고 크기나 위치를 정해줘야한다.
		frame.setTitle("제목이다.");				// 세터도 있음
		frame.getContentPane().add(new JLabel("Hello World"));		// component 요소
		frame.setDefaultCloseOperation(3);		// 특, 닫아도 프로그램이 안꺼져서 설정 따로 해줘야함 (상수)
		frame.setSize(500, 500);				// 크기 설정
		frame.setVisible(true);					// 보여주기 여부 설정
		
	}
}
