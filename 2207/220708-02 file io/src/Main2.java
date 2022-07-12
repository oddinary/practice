import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String line = "hello future";
		try {
			fos = new FileOutputStream(new File("d:\\jinho\\filetest\\practice.txt"));

				fos.write(line.getBytes()); //byte 배열의 형식으로 알려줌

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
