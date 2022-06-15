package student_drill4;

public class Main {
	public static void main(String[] args) {
		Students m1 = new Students("이진호", 1234567, "디자인", 4, 130);
		System.out.println(m1.toString());
		UnderGraduate m2 = new UnderGraduate("이진호", 1234567, "디자인", 4, 130, "댄스");
		System.out.println(m2.toString());
		Graduate m3 = new Graduate("이진호", 1234567, "디자인", 4, 130, "연구조교", 0.7);
		System.out.println(m3.toString());
	}
}
