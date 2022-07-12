import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		// d드라이브 filetest에 한글이름.txt를 만들어보세용
		
		File fileKor = new File("d:\\jinho\\filetest\\한글이름.txt");
		try {
			System.out.println("생성됨? " + fileKor.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일이름을 변경하려면??
		fileKor.renameTo(new File("d:\\jinho\\filetest\\새로운 이름.txt")); // 새로운 객체를 생성! (성공하면 true)
		
		// 파일을 지우려면??
		
		File myText = new File("d:\\jinho\\filetest\\mytext.txt");
		myText.delete(); // 복구는 없으니까 조심해서 잘 해야함(권한이 없는 곳, 파일은 권한이 없어서 예외가 발생함)
	}
}
