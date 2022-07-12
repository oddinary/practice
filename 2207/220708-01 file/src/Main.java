import java.io.File;

public class Main {
	public static void main(String[] args) {
		//절대 경로
		File file = new File("D:\\jinho\\test.txt"); // import 해줘야 함
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		File f2 = new File("D:\\jinho\\asdf.txt"); // 파일 객체(외부의 파일을 가리킬수 있음)
		
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.exists()); // 실존하는지 알아봐야함
		
		File dir = new File("D:\\jinho"); // 디렉토리도 호출 할 수 있음
		
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요?? " + dir.isFile());
		System.out.println("디렉토리인가요?? " + dir.isDirectory());
	}
}
