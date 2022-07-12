import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {
	public static void main(String[] args) {
		// 파일을 (직접) 생성
		// persons.txt
		// 파일 정보를 한 줄씩 읽어서
		// 1. 콘솔 출력
		// 2. 평균나이 구해서 출력
		File file = new File("d:\\jinho\\filetest\\persons.txt");

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));

			String line;
			int sum = 0;
			int count = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				int index = line.indexOf(',');
				String strAge = line.substring(index + 1);
				Integer age = Integer.valueOf(strAge);
				
				System.out.println(age);
				sum += age;
				count++;
			}
			System.out.println("평균나이 : " + sum / count);			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
