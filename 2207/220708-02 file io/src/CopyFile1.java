import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;

			while ((c = in.read()) != -1) { // 파일이 끝일 때 -1을 가져온다. 그러니까 끝이 아닐 때 하나씩 집어 넣어라는 뜻
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
