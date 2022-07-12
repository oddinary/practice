import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		List<Student> list = new ArrayList<>();
		try {
			// 자바에서 읽고 쓰기에는 편하지만 자바 시스템안에서 밖에 사용할 수 없다는 단점이 있다.
			dis = new DataInputStream(new FileInputStream(new File("d:\\jinho\\filetest\\stedent.dat")));
			while (true) {
				
				// 기록한 순서대로 해야 원하는 정보를 얻을 수 있다.(기본형에는 길이가 있으니까)
				String name = dis.readUTF();
				int age = dis.readInt();
				double score = dis.readDouble();
				Student s = new Student(name, age, score);
				list.add(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("학생정보를 파일 끝까지 다 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(list);
	}
}
