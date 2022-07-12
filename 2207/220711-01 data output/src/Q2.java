import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Q2 {
	public static void main(String[] args) {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("d:\\jinho\\filetest\\code\\plain.txt");
			outputStream = new FileWriter("d:\\jinho\\filetest\\code\\code.txt");
			int c;

			while ((c = inputStream.read()) != -1) {
				System.out.println("읽은 문자 확인 : " + (char) c);
				if ((char) c == ' ')
					outputStream.write(c);
				else if ((char) c == 'x' || (char) c == 'y' || (char) c == 'z') {
					char ch = (char) (c - 23);
					String word = String.valueOf(ch);
					word = word.toUpperCase();
					outputStream.write(word);
				} else {
					char ch_1 = (char) (c + 3);
					String word_1 = String.valueOf(ch_1);
					word_1 = word_1.toUpperCase();
					outputStream.write(word_1);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
