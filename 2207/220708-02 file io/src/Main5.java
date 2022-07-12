import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
	public static void main(String[] args) {
		File file = new File("d:\\jinho\\filetest\\lineio.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}; // 파일 끝을 만나면 널을 반환함.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) { // 문자열이 아닐때 까지 반환
				try {
					br.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
