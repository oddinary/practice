import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fis = null; // 내부적으로 바이트 만큼 읽어냄
		try {
			File file = new File("d:\\jinho\\filetest\\practice.txt"); // 파일 객체 생성
			int length = (int) file.length(); //long으로 반환하니까 int로 형 변환 해준다. // 파일의 크기를 나타냄(현재는 12바이트)
			
			byte[] buf = new byte[length]; // 파일크키와 같은 길이의 배열을 생성
			
			fis = new FileInputStream(file); // 대입
			fis.read(buf);	// 읽기(배열 만큼), 문자열은 아님 파일 끝을 만나면 -1을 반환함
			
			String result = new String(buf); // 배열을 문자열로 변환
			System.out.println(result); // 출력
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close(); // 스트림 닫아주기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
