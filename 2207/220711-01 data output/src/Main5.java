import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main5 {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			//객체를 주고 받는 스트림(스태틱은 안됨)
			oos = new ObjectOutputStream(new FileOutputStream("d:\\jinho\\filetest\\s1.ser"));
			// 직렬화 불가능 예외 발생(직렬화 가능하게 만들어 줘야함(인터페이스를 구현해주면 됨 클래스에 implements Serializable 해주면 됨 ))
			oos.writeObject(new Student("학생1", 33, 3.0));
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
