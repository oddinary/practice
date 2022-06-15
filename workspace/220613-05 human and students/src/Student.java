
public class Student extends Human{
	private String major;

	public Student(String name, int age, String profession, String major) {
		super(name, age, profession);
		this.major = major;
	}
	@Override
	public String toString() {
		// 부모의 메소드를 호출 하는 법
		return super.toString() + ", 전공 : " + major;
	}

	@Override
	public String getProfession() {
		return "학생";
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public static void main(String[] args) {
		Student mj = new Student("명진", 21,"" ,"컴퓨터");
		Student mh = new Student("미현", 22,"" ,"경영");
		Student yj = new Student("용준", 24,"" ,"경제");
		
		System.out.println(mj.toString());
		System.out.println(mh.toString());
		System.out.println(yj.toString());
	}
}
