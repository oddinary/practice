import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\jinho\\filetest\\mytext.txt");
		System.out.println(diaryFile.exists());
		
		Scanner scanner = null; // 스캐너는 빨대
		
		try {
			scanner = new Scanner(diaryFile);
			
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없는데?");
			e.printStackTrace();
		} finally {
			if(scanner != null) {
				scanner.close(); // 빨대 꽂은것도 빼줘야하는데 이걸 자원해제라고 한다. 무조건 해줘야 하니까 finally에 넣었음
			}
		}
	}
}
