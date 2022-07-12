import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\jinho\\filetest\\lineio.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file));
			
			pw.println("문자열 한 줄을 출력합니다.");
			pw.println(10);
			pw.println(15.15);
			pw.flush(); // 임시공간에 쌓인 데이터를 파일로 출력하게 해주는 명령어(임시공간을 비운다.)
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw != null) {
				pw.close();
			}
		}
	}
}
