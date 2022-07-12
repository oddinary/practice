import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest");
		System.out.println("있냐?" + file.exists()); // false 파일이 존재하지 않아서.
		System.out.println("폴더임?" + file.isDirectory()); // false 파일이 존재하지 않아서.
		System.out.println("파일임?" + file.isFile()); // false 파일이 존재하지 않아서.
		
		boolean result = file.mkdir(); // make(만들어라.)
		System.out.println("디렉토리 생성여부 : " + result);
		
		//d 드라이브에 filetest폴더에(디렉토리)안에 abc폴더를 생성해보세요
		
		File abc = new File("d:\\jinho\\filetest\\abc"); 
		abc.mkdir(); // 생성을 시도하고 생성을 성공하면 true 실패하면 false를 반환함
		
		File file2 = new File("d:\\jinho\\filetest\\abc\\..\\def");
		file2.mkdir();
		
		try {
			File file3 = file2.getCanonicalFile();// CanonicalPath를 객체로 반환하는 메소드
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//파일을 생성해보자
		
		File textFile = new File("d:\\jinho\\filetest\\mytext.txt");
		
		try {
			boolean result2 = textFile.createNewFile(); // 이미 있으면 생성안됨
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
