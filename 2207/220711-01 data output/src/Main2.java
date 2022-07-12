import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	// 기초형 타입을 그래도 읽고 써보자
	public static void main(String[] args) {
		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new FileOutputStream("d:\\jinho\\filetest\\mydata.dat")); //
			// byte단위로 출력을 하기 때문에 사람이 읽을 수 있는 형태가 아님
			dos.writeInt(50);
			dos.writeDouble(123.123);
			dos.writeUTF("문자열");
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream("d:\\jinho\\filetest\\mydata.dat"));
			// 자료형태 그대로 불러 올 수 있으니까 좋다.
			int valueInt = dis.readInt();
			double valueDouble = dis.readDouble();
			String valueString = dis.readUTF(); 
			
			System.out.println(valueInt);
			System.out.println(valueDouble);
			System.out.println(valueString);
			
			dis.readBoolean();// 파일의 끝을 예외로 알려주는데 이걸 EndOfException(EOFException)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // IOE를 상속하기 때문에 위에 적어줘야함
			System.out.println("파일을 끝까지 다 읽음");
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
	}
}
